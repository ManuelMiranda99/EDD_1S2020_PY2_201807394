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
    private SLNode root;
    
    public SimpleList(){
        root = null;
    }
    
    public void Insert(Object _newObject){
        SLNode newNode = new SLNode(_newObject);
        if(root == null){
            root = newNode;
        }else{
            newNode.next = root;
            root = newNode;
        }
    }
    
    public String GenerateDot(){
        String graph =  "digraph L{ \n"                                     + 
                        "graph[label=\"Lista Simple\"]; \n"                 + 
                        "rankdir=LR;\n"                                     +
                        "node[shape=box,color=lightblue,style=filled];\n";
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
}
