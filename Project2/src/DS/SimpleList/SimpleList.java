/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.SimpleList;

/**
 *
 * @author manuel
 */
public class SimpleList {
    public SLNode root;
    private SLNode last;
    public int size = 0;
    
    public SimpleList(){
        root = last = null;
    }
    
    public void Insert(Object _newObject){
        SLNode newNode = new SLNode(_newObject);
        if(root == null){
            root = last = newNode;
        }else{
            newNode.next = root;
            root = newNode;
        }
        size++;
    }
    
    public void InsertLast(Object _newObject){
        SLNode newNode = new SLNode(_newObject);
        if(root == null)
            root = last = newNode;
        else{
            last.next = newNode;
            last = newNode;
        }
        size++;
    }
    
    public String GenerateDot(){
        String graph =  "digraph L{ \n"                                     + 
                        "graph[label=\"Lista Simple\", bgcolor=black, fontcolor=white]; \n"                 + 
                        "rankdir=LR;\n"                                     +
                        "node[shape=box,fillcolor=lemonchiffon1,style=filled];"
                +       "edge[color=white];\n\n";
        int x = 1;
        SLNode aux = root;
        if(aux != null){
            do{
                graph += "X" + String.valueOf(x) + " [label=\"" + aux.value.toString() + "\"]; \n";
                x++;
                aux = aux.next;
            }while(aux != null);
            x = 1;
            aux = root;
            do{
                graph += "X" + String.valueOf(x) + "->";
                x++;
                aux = aux.next;
            }while(aux.next != null);
            graph += "X" + String.valueOf(x) + ";\n }";
            return graph;
        }                
        return null;
    }
    
    public SimpleList CopyList(){
        SimpleList newList = new SimpleList();
        
        SLNode aux = root;
        
        while(aux != null){
            SLNode newNode = new SLNode(aux.value);
            newList.InsertLast(newNode);
            aux = aux.next;
        }
        
        return newList;
    }
}
