/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.BTree;

import Objects.Book;
import Objects.Category;
import javax.swing.JComboBox;
import project2.Project2;

/**
 *
 * @author manuel
 */
public class BTree {

    private BTreeNode root;
    private int t;
    public int count = 0;
    Category category;
    
    public BTree(int _t, Category _category){
        t = _t;
        root = new BTreeNode(_t, true);
        root.count = 0;
        this.category = _category;
    }
    
    public BTreeNode SearchByISBN(int _ISBN){
        return SearchByISBN(root, _ISBN);
    }
    
    private BTreeNode SearchByISBN(BTreeNode _root, int _ISBN){
        int i = 0;
        if(_root == null)
            return _root;
        for(i=0; i < _root.count ; i++){
            if(_ISBN < _root.books[i].getISBN()){
                break;
            }
            if(_ISBN == _root.books[i].getISBN()){
                return _root;
            }
        }
        
        if(_root.leaf){
            return null;
        }
        else{
            return SearchByISBN(_root.childs[i], _ISBN);
        }
    }
    
    private void SplitNode(BTreeNode _x, int _position, BTreeNode _y){
        BTreeNode newNode = new BTreeNode(t, _y.leaf);
        newNode.count = t - 1;
        
        for(int j = 0; j < t-1 ; j++){
            newNode.books[j] = _y.books[j + t];
        }
        
        if(!_y.leaf){
            for(int j = 0; j < t; j++){
                newNode.childs[j] = _y.childs[j + t];
            }
        }
        _y.count = t - 1;
        
        for(int j = _x.count; j >= _position + 1; j--){
            _x.childs[j + 1] = _x.childs[j];
        }
        _x.childs[_position + 1] = newNode;
        
        for(int j = _x.count - 1; j >= _position; j--){
            _x.books[j + 1] = _x.books[j];
        }
        
        _x.books[_position] = _y.books[t - 1];
        _x.count++;
    }
    
    public void Insert(int _ISBN, Book _book){
        BTreeNode newNode = root;
        if(newNode.count == 2*t - 1){
            BTreeNode aux = new BTreeNode(t, false);
            root = aux;
            aux.count = 0;
            aux.childs[0] = newNode;
            SplitNode(aux, 0, newNode);
            RecursiveInsert(aux, _ISBN, _book);
        }
        else{
            RecursiveInsert(newNode, _ISBN, _book);
        }        
    }
    
    private void RecursiveInsert(BTreeNode _root, int _ISBN, Book _book){
        
        if(_root.leaf){
            int i=0;
            for(i = _root.count - 1; i >= 0 && _ISBN < _root.books[i].getISBN(); i--){
                _root.books[i + 1] = _root.books[i];
            }
            
            _root.books[i + 1] = _book;
            _root.count++;
            this.count++;
        } else {
            int i=0;
            for(i = _root.count - 1; i >= 0 && _ISBN < _root.books[i].getISBN(); i--){}
            
            i++;
            BTreeNode temp = _root.childs[i];
            if(temp.count == 2*t - 1){
                SplitNode(_root, i, temp);
                if(_ISBN > _root.books[i].getISBN())
                    i++;                
            }
            RecursiveInsert(_root.childs[i], _ISBN, _book);
        }
        
    }
    
    public void DeleteBook(int _ISBN, int _user){
        RecursiveDeleteBook(root, _ISBN, _user);
    }
    
    private void RecursiveDeleteBook(BTreeNode n, int _ISBN, int _user){
        int index = n.SearchBookByISBN(_ISBN);
        
        if(index != -1){
            if(n.books[index].getUserID() != _user){
                // Show Message
                return;
            }
            if(n.leaf){
                int i=0;
                for(i=0; i<n.count && n.books[i].getISBN() != _ISBN; i++){}
                
                for(; i < n.count; i++){
                    if(i != 2*t - 2){
                        n.books[i] = n.books[i+1];
                    }
                }
                n.count--;
                
            }else{
                
                BTreeNode prd = n.childs[index];
                Book prdBook = null;
                if(prd.count >= t){
                    while(!prd.leaf){
                        prd = prd.childs[prd.count];
                    }
                    prdBook = prd.books[prd.count - 1];
                    RecursiveDeleteBook(prd, prdBook.getISBN(), _user);
                    n.books[index] = prdBook;
                    return;
                }
                
                BTreeNode nxt = n.childs[index + 1];
                if(nxt.count >= t){
                    Book nxtBook = nxt.books[0];
                    if(!nxt.leaf){
                        nxt = nxt.childs[0];
                        while(!nxt.leaf){
                            nxt = nxt.childs[nxt.count];
                        }
                        nxtBook = nxt.books[nxt.count - 1];
                    }
                    RecursiveDeleteBook(nxt, nxtBook.getISBN(), _user);
                    return;
                }
                
                int temp = prd.count + 1;
                prd.books[prd.count++] = n.books[index];
                for(int i=0, j = prd.count; i < nxt.count; i++){
                    prd.books[j++] = nxt.books[i];
                    prd.count++;
                }
                for(int i=0; i < nxt.count + 1; i++){
                    prd.childs[temp++] = nxt.childs[i];
                    nxt.childs[i] = null;
                }
                
                n.childs[index] = prd;
                for(int i=index; i< n.count; i++){
                    if(i != 2*t - 2){
                        n.books[i] = n.books[i+1];
                    }
                }
                for(int i=index + 1;i < n.count + 1; i++){
                    if(i != 2*t - 1){
                        n.childs[i] = n.childs[i+1];
                    }
                }
                n.count--;
                if(n.count == 0){
                    if(n == root){
                        root = n.childs[0];
                    }
                    n = n.childs[0];
                }
                RecursiveDeleteBook(prd, _ISBN, _user);
                return;
            }
            
        }else{
            
            for(index = 0; index <= n.count; index++){
                if(n.books[index].getISBN() > _ISBN){
                    break;
                }
            }
            BTreeNode temp = n.childs[index];
            if(temp.count >= t){
                RecursiveDeleteBook(temp, _ISBN, _user);
                return;
            }
            
            BTreeNode nb = null;
            Book dv = null;
            
            if(index != n.count && n.childs[index + 1].count >= t){
                
                dv = n.books[index];
                nb = n.childs[index + 1];
                n.books[index] = nb.books[0];
                temp.books[temp.count++] = dv;
                temp.childs[temp.count] = nb.childs[0];
                
                for(int i = 1; i < nb.count; i++){
                    nb.books[i - 1] = nb.books[i];
                    nb.childs[i - 1] = nb.childs[i];
                }
                nb.count--;
                RecursiveDeleteBook(temp, _ISBN, _user);
                return;
                
            }else if(index != 0 && n.childs[index - 1].count >= t){
                
                dv = n.books[index - 1];
                nb = n.childs[index - 1];
                n.books[index - 1] = nb.books[nb.count - 1];
                BTreeNode child = nb.childs[nb.count];
                nb.count--;
                
                for(int i=temp.count; i > 0; i--){
                    temp.books[i] = temp.books[i - 1];
                }
                temp.books[0] = dv;
                
                for(int i = temp.count + 1; i > 0; i--){
                    temp.childs[i] = temp.childs[i-1];
                }
                temp.childs[0] = child;
                temp.count++;
                
                RecursiveDeleteBook(temp, _ISBN, _user);
                return;
            }else{
                BTreeNode lt, rt;
                boolean last = false;
                
                if(index != n.count){
                    dv = n.books[index];
                    lt = n.childs[index];
                    rt = n.childs[index + 1];
                }else{
                    dv = n.books[index - 1];
                    rt = n.childs[index];
                    lt = n.childs[index - 1];
                    last = true;
                    index--;
                }
                
                for(int i = index; i < n.count - 1; i++){
                    n.books[i] = n.books[i + 1];
                }
                for(int i = index + 1; i < n.count; i++){
                    n.childs[i] = n.childs[i + 1];
                }
                n.count--;
                lt.books[lt.count++] = dv;
                
                for(int i=0, j = lt.count; i < rt.count + 1; i++, j++){
                    if(i < rt.count)
                        lt.books[j] = rt.books[i];
                    lt.childs[j] = rt.childs[i];
                }
                lt.count += rt.count;
                if(n.count == 0){
                    if(n == root)
                        root = n.childs[0];
                    n = n.childs[0];
                }
                
                RecursiveDeleteBook(lt, _ISBN, _user);
                return;
            }
            
        }
    }
    
    public void FillComboBox(String _title, JComboBox _cmb){
        root.FillComboBox(_title, _cmb);
    }
    
    public void GenerateTree(){
        if(root.count != 0){
            String graph = 
                        "digraph btree {\n"
                    +   "rankdir=TB;\n"
                    +   "graph[fontcolor=white, bgcolor=black, label=\"Libros " + category.getName() + "\", color=white];\n"
                    +   "node[style=filled, fillcolor=lemonchiffon1, shape=record, height=.1];\n"
                    +   "edge[color=white];\n"
                    +   root.GenerateNode()
                    +   "}";
            Project2.gGenerator.GenerateGraph(graph, "ArbolB" + category.getName() + ".txt");
        }
    }
}
