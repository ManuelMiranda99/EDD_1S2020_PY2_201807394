/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.AVL;

import DS.BTree.BTreeNode;
import DS.SimpleList.SimpleList;
import Objects.Book;
import Objects.Category;
import javax.swing.JComboBox;
import project2.Project2;

/**
 *
 * @author manuel
 */
public class AVL {
    
    private AVLNode root;
    private SimpleList report;
    
    public AVL(){
        root = null;
        report = new SimpleList();
    }
    
    private int height(AVLNode root){
        if(root == null)
            return 0;
        return root.balance;
    }
    
    private int MAX(int a, int b){
        return(a > b) ? a : b;
    }
    
    private AVLNode RightRotate(AVLNode root){
        AVLNode aux = root.left;
        AVLNode aux1 = aux.right;
        
        aux.right = root;
        root.left = aux1;
        
        root.balance = MAX(height(root.left), height(root.right)) + 1;
        aux.balance =  MAX(height(aux.left), height(aux.right)) + 1;
        
        return aux;
    }
    
    private AVLNode LeftRotate(AVLNode root){
        AVLNode aux = root.right;
        AVLNode aux1 = aux.left;
        
        aux.left = root;
        root.right = aux1;
        
        root.balance = MAX(height(root.left), height(root.right)) + 1;
        aux.balance =  MAX(height(aux.left), height(aux.right)) + 1;
        
        return aux;
    }
    
    private int GetBalance(AVLNode root){
        if(root == null)
            return 0;
        return height(root.left) - height(root.right);
    }
    
    public void AddCategory(Category _category){
        root = RecursiveAdd(root, _category);
    }
    
    private AVLNode RecursiveAdd(AVLNode root, Category _category){
        if(root == null)
            return new AVLNode(_category);

        // _category.getName < root.getCategory.getName 
        if(_category.getName().compareToIgnoreCase(root.getCategory().getName()) < 0){
            root.left = RecursiveAdd(root.left, _category);
        }
        // _category.getName > root.getCategory.getName
        else if(_category.getName().compareToIgnoreCase(root.getCategory().getName()) > 0){
            root.right = RecursiveAdd(root.right, _category);
        }
        // _category.getName == root.getCategory.getName
        else{
            // Duplicated category
            return root;
        }
        
        return Balance(root, _category);               
    }
    
    public AVLNode SearchCategory(String _category){        
        return RecursiveGet(root, _category);
    }
    
    private AVLNode RecursiveGet(AVLNode root, String _category){
        if(root == null || root.getCategory().getName().equals(_category)){
            return root;
        }
        // root > key
        if(root.getCategory().getName().compareTo(_category) > 0)
            return RecursiveGet(root.left, _category);
        return RecursiveGet(root.right, _category);
    }
    
    private AVLNode MINNode(AVLNode root){
        AVLNode current = root;
        
        while(current.left != null)
            current = current.left;
        
        return current;
    }
    
    public void DeleteCategory(String _category, int _id){
        root = RecursiveDeleteCategory(root, _category, _id);
    }
    
    public AVLNode RecursiveDeleteCategory(AVLNode root, String _category, int _id){
        // Non existing node
        if(root == null)
            return root;
        
        // _category.getName < root.getCategory.getName 
        if(_category.compareToIgnoreCase(root.getCategory().getName()) < 0){
            root.left = RecursiveDeleteCategory(root.left, _category, _id);
        }
        // _category.getName > root.getCategory.getName
        else if(_category.compareToIgnoreCase(root.getCategory().getName()) > 0){
            root.right = RecursiveDeleteCategory(root.right, _category, _id);
        }
        // _category.getName == root.getCategory.getName
        else{
            // If the user that try to eliminate the category is different that the one who create it
            if(_id != root.getCategory().getUserID()){
                return root;
            }
            else{
                // DELETE NODE
                // Node without one or no childs
                if(root.left == null || root.right == null){
                    AVLNode aux = null;
                    if(aux == root.left)
                        aux = root.right;
                    else
                        aux = root.left;
                    if(aux == null){
                        aux = root;
                        root = null;
                    }else
                        root = aux;
                }
                // Node with both Childs, change node with the minor element in the right
                else{
                    AVLNode aux = MINNode(root.right);

                    root.setCategory(aux.getCategory());
                    root.setBooks(aux.getBooks());

                    root.right = RecursiveDeleteCategory(root.right, aux.getCategory().getName(), _id);
                }
            }            
        }
        
        if(root == null)
            return root;
        
        root.balance = 1 + MAX(height(root.left), height(root.right));
        
        int balance = GetBalance(root);
        
        if(balance > 1 && GetBalance(root.left) >= 0)
            return RightRotate(root);
        
        if(balance > 1 && GetBalance(root.left) < 0){
            root.left = LeftRotate(root.left);
            return RightRotate(root);
        }
          
        if (balance < -1 && GetBalance(root.right) <= 0)  
            return LeftRotate(root);  
  
        if (balance < -1 && GetBalance(root.right) > 0){  
            root.right = RightRotate(root.right);  
            return LeftRotate(root);  
        }
        
        return root;
    }
    
    private AVLNode Balance(AVLNode root, Category _category){
        root.balance = 1 + MAX(height(root.left), height(root.right));
        
        int balance = GetBalance(root);
        
        if(balance > 1 && _category.getName().compareToIgnoreCase(root.left.getCategory().getName()) < 0)
            return RightRotate(root);
        
        if(balance < -1 && _category.getName().compareToIgnoreCase(root.right.getCategory().getName()) > 0)
            return LeftRotate(root);
        
        if(balance > 1 && _category.getName().compareToIgnoreCase(root.left.getCategory().getName()) > 0){
            root.left = LeftRotate(root.left);
            return RightRotate(root);
        }
        
        if(balance < -1 && _category.getName().compareToIgnoreCase(root.right.getCategory().getName()) < 0){
            root.right = RightRotate(root.right);
            return LeftRotate(root);
        }
        return root;
    }
    
    /*----------CHECK----------*/
    private boolean flagISBN = false;
    public boolean CheckISBN(int _ISBN){
        flagISBN = false;
        RecursiveCheck(root, _ISBN);
        return flagISBN;
    }
    
    private void RecursiveCheck(AVLNode root, int _ISBN){
        if(root != null){
            if(root.getBooks().SearchByISBN(_ISBN) != null){
                flagISBN = true;
                return;
            }
            RecursiveCheck(root.left, _ISBN);
            RecursiveCheck(root.right, _ISBN);
        }
    }
    
    Book aux = null;
    public Book GetBook(int _ISBN){
        RecursiveGetBook(root, _ISBN);
        return aux;
    }
    
    private void RecursiveGetBook(AVLNode root, int _ISBN){
        if(root != null){
            BTreeNode aux = root.getBooks().SearchByISBN(_ISBN);
            if(aux != null){
                for(int i = 0; i < aux.count ; i++){
                    if(aux.books[i].getISBN() == _ISBN){
                        this.aux = aux.books[i];
                        return;
                    }
                }
            }
            RecursiveGetBook(root.left, _ISBN);
            RecursiveGetBook(root.right, _ISBN);
        }
    }       
    
    public void DeleteISBN(int _ISBN, int _user){
        RecursiveDelete(root, _ISBN, _user);
    }
    
    private void RecursiveDelete(AVLNode root, int _ISBN, int _user){
        if(root != null){
            if(root.getBooks().SearchByISBN(_ISBN) != null){
                root.getBooks().DeleteBook(_ISBN, _user);
            }
            RecursiveDelete(root.left, _ISBN, _user);
            RecursiveDelete(root.right, _ISBN, _user);
        }
    }
   
    public void FillComboBox(String _title, JComboBox _cmb){
        RecursiveFillComboBox(root, _title, _cmb);
    }
    
    private void RecursiveFillComboBox(AVLNode root, String _title, JComboBox _cmb){
        if(root != null){
            RecursiveFillComboBox(root.left, _title, _cmb);
            root.getBooks().FillComboBox(_title, _cmb);
            RecursiveFillComboBox(root.right, _title, _cmb);
        }
    }
    
    /*----------REPORTS----------*/
    public void FillComboBox(JComboBox _cmb){
        _cmb.removeAllItems();
        RecursiveFillComboBox(root, _cmb);
    }
    
    private void RecursiveFillComboBox(AVLNode root, JComboBox _cmb){
        if(root != null){
            RecursiveFillComboBox(root.left, _cmb);
            _cmb.addItem(root.getCategory().getName());
            RecursiveFillComboBox(root.right, _cmb);
        }
    }
    
    public void GenerateTree(){
        if(root != null){
            String graph =  "digraph avl {\n"                                   +
                        "rankdir=TB;\n"                                     +
                        "graph[bgcolor=black, label=\"Categorias\"];\n"     +
                        "node[style=filled, fillcolor=lemonchiffon1];\n"    +
                        "edge[color=white];\n";
            graph += root.GenerateNode();
            graph += "}";
            Project2.gGenerator.GenerateGraph(graph, "CategoriasAVL.txt");
        }        
    }
    
    private void DeleteReportList(){
        report = new SimpleList();
    }
    
    private void GenerateGraphviz(String _name){
        Project2.gGenerator.GenerateGraph(report.GenerateDot(), _name);
    }
    
    public void PreOrderReport(){
        DeleteReportList();
        RecursivePreOrder(root);
        GenerateGraphviz("AVLPreOrderReport.txt");
    }
    
    private void RecursivePreOrder(AVLNode root){
        if(root != null){
            report.Insert(root.getCategory().getName());
            RecursivePreOrder(root.left);
            RecursivePreOrder(root.right);
        }
    }
    
    public void InOrderReport(){
        DeleteReportList();
        RecursiveInOrder(root);
        GenerateGraphviz("AVLInOrderReport.txt");
    }
    
    private void RecursiveInOrder(AVLNode root){
        if(root != null){            
            RecursiveInOrder(root.left);
            report.Insert(root.getCategory().getName());            
            RecursiveInOrder(root.right);
        }
    }
    
    public void PostOrderReport(){
        DeleteReportList();
        RecursivePostOrder(root);
        GenerateGraphviz("AVLPostOrderReport.txt");
    }
    
    private void RecursivePostOrder(AVLNode root){
        if(root != null){
            RecursivePostOrder(root.left);            
            RecursivePostOrder(root.right);
            report.Insert(root.getCategory().getName());            
        }
    }
}
