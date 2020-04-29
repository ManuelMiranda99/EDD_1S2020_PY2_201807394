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

/**
 *
 * @author manuel
 */
public class BTree {

    private BTreeNode root;
    private int t;
    
    public BTree(int _t) {
        this.root = null;
        this.t = _t;
    }
    
    public void InsertBook(Book newBook){
        if(root == null){
            root = new BTreeNode(t, true);
            root.books[0] = newBook;
            root.IncrementNodes();
        }
        else{
            if(root.IsFull()){
                BTreeNode newNode = new BTreeNode(t, false);
                
                newNode.childs[0] = root;
                
                newNode.SplitChild(0, root);
                
                int i = 0;
                if(newNode.books[0].getISBN() < newBook.getISBN())
                    i++;
                newNode.childs[0].InsertNonFullNode(newBook);
                
                root = newNode;
            }
            else
                root.InsertNonFullNode(newBook);
        }
    }
    
    public Book SearchByISBN(int _ISBN){
        if(root == null)
            return null;
        else
            return this.root.SearchByISBN(_ISBN);
    }
    
}
