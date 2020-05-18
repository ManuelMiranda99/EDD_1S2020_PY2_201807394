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
import javax.swing.JComboBox;

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
    
    public String GenerateNode(){
        String graph = "";
        
        
        // Generating the node
        graph += "Node" + books[0].getISBN() + "[label=\"";
        for(int i=0; i < count; i++){
            graph += "<f" + i + ">  | " + books[i].getISBN() + "|";
        }
        graph += " <f" + count + ">\"];";
        
        // Adding Connections
        for(int i=0; i <= count; i++){
            if(childs[i] == null)
                continue;
            graph += childs[i].GenerateNode();
            graph += "Node" + books[0].getISBN() + ":f" + i + "->Node" + childs[i].books[0].getISBN() + ";\n";
        }
        return graph;
    }
    
    public void FillComboBox(String _title, JComboBox _cmb){
        int i = 0;
        for(i = 0; i <= this.count; i++){
            if(!this.leaf){
                this.childs[i].FillComboBox(_title, _cmb);
            }
            if(i != count){
                if(this.books[i].getTitle().contains(_title))
                    _cmb.addItem(this.books[i].getISBN() + "-" + this.books[i].getTitle());
            }
        }
    }
}
