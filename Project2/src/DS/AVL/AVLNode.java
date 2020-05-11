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
    private Category category;
    private BTree books;
    
    public AVLNode(Category _category){
        right = left = null;
        this.category = _category;
        this.books = new BTree(3);
        this.balance = 1;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setBooks(BTree books) {
        this.books = books;
    }

    public Category getCategory() {
        return category;
    }

    public BTree getBooks() {
        return books;
    }
    
    public String GenerateNode(){
        String graph = "";
        
        graph += "\"" + category.getName().replaceAll(" ", "_") + "\" [label=\"" + category.getName() + "\"]; \n";
        
        if(left != null){
            graph += left.GenerateNode() + "\"" + category.getName().replaceAll(" ", "_") + "\"->\"" + left.getCategory().getName().replace(" ", "_") + "\";\n";
        }
        
        if(right != null){
            graph += right.GenerateNode() + "\"" + category.getName().replaceAll(" ", "_") + "\"->\"" + right.getCategory().getName().replace(" ", "_") + "\";\n";
        }
        graph += "\n";
        return graph;
    }
    
}
