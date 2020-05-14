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
public class BTreeNode {
    public Book[] books;
    private final int t;
    public BTreeNode[] childs;
    public int count;
    public boolean leaf;

    public BTreeNode(int _t, boolean _leaf) {
        this.t = _t;
        this.leaf = _leaf;
        this.books = new Book[2*t - 1];
        this.childs = new BTreeNode[2*t];
        this.count = 0;
    }
    
    public int SearchBookByISBN(int _ISBN){
        for(int i = 0; i < this.count; i++){
            if(this.books[i].getISBN() == _ISBN){
                return i;
            }
        }
        return -1;
    }
    
}
