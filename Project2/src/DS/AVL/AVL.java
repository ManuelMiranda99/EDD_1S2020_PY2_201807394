/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.AVL;

import Objects.Category;

/**
 *
 * @author manuel
 */
public class AVL {
    private AVLNode root;
    
    public AVL(){
        
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

        // _category.getName > root.getCategory.getName 
        if(_category.getName().compareToIgnoreCase(root.getCategory().getName()) < 0){
            root.left = RecursiveAdd(root.left, _category);
        }
        // _category.getName < root.getCategory.getName
        else if(_category.getName().compareToIgnoreCase(root.getCategory().getName()) > 0){
            root.right = RecursiveAdd(root.right, _category);
        }
        // _category.getName == root.getCategory.getName
        else{
            return root;
        }
        
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
    
    public void DeleteCategory(String _category){
        root = RecursiveDeleteCategory(root, _category);
    }
    
    public AVLNode RecursiveDeleteCategory(AVLNode root, String _category){
        if(root == null)
            return root;
        
        // _category.getName > root.getCategory.getName 
        if(_category.compareToIgnoreCase(root.getCategory().getName()) < 0){
            root.left = RecursiveDeleteCategory(root.left, _category);
        }
        // _category.getName < root.getCategory.getName
        else if(_category.compareToIgnoreCase(root.getCategory().getName()) > 0){
            root.right = RecursiveDeleteCategory(root.right, _category);
        }
        // _category.getName == root.getCategory.getName
        else{
            
        }
        return root;
    }
    
    /*----------REPORTS----------*/
    public void PreOrderReport(){
        RecursivePreOrder(root);
    }
    
    private void RecursivePreOrder(AVLNode root){
        if(root != null){
            System.out.println(root.getCategory().getName());
            RecursivePreOrder(root.left);
            RecursivePreOrder(root.right);
        }
    }
    
    public void InOrderReport(){
        RecursiveInOrder(root);
    }
    
    private void RecursiveInOrder(AVLNode root){
        if(root != null){            
            RecursiveInOrder(root.left);
            System.out.println(root.getCategory().getName());
            RecursiveInOrder(root.right);
        }
    }
    
    public void PostOrderReport(){
        RecursivePostOrder(root);
    }
    
    private void RecursivePostOrder(AVLNode root){
        if(root != null){            
            RecursivePostOrder(root.left);            
            RecursivePostOrder(root.right);
            System.out.println(root.getCategory().getName());
        }
    }
}
