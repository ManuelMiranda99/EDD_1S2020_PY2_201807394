/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.AVL;

import DS.BTree.BTree;
import Objects.Category;

/**
 *
 * @author manuel
 */
public class AVLNode {
    public AVLNode right, left;
    public int balance;
    private final Category category;
    private BTree books;
    
    public AVLNode(Category _category){
        right = left = null;
        this.category = _category;
        //this.books = new BTree(5);
        this.balance = 1;
    }

    public Category getCategory() {
        return category;
    }

    public BTree getBooks() {
        return books;
    }
    
}
