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
    
    public String GenerateNode(){
        String graph = "";
        
        /*
        digraph g {
        node [shape = record,height=.1];
        
        node0[label = "<f0> |10|<f1> |20|<f2> |30|<f3>"];
        
        node1[label = "<f0> |1|<f1> |2|<f2>"];
        "node0":f0 -> "node1"
        node2[label = "<f0> |11|<f1> |12|<f2>"];
        "node0":f1 -> "node2"
        node3[label = "<f0> |21|<f1> |22|<f2>"];
        "node0":f2 -> "node3"
        node4[label = "<f0> |31|<f1> |32|<f2>"];
        "node0":f3 -> "node4"

        }
        */
        
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
    
}
