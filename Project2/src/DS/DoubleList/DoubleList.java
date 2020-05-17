/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.DoubleList;

import Objects.Block;
import static project2.Project2.gGenerator;

/**
 *
 * @author manuel
 */
public class DoubleList {
    DLNode first, last;
    int size;
    
    public DoubleList(){
        first = last = null;
        size = 0;
    }
    
    public void InsertFirst(Object obj){
        DLNode newNode = new DLNode(obj);
        
        if(first == null){
            first = last = newNode;
        }else{
            first.previous = newNode;
            newNode.next = first;
            
            first = newNode;
        }
        size++;
    }
    
    public void InsertLast(Object obj){
        DLNode newNode = new DLNode(obj);
        
        if(first == null){
            first = last = newNode;
        }else{
            last.next = newNode;
            newNode.previous = last;
            
            last = newNode;
        }
        size++;
    }
    
    public void GenerateReport(){
        if(first == null)
            return;
        String graph =  "digraph DoubleList {\n"
                +       "graph[bgcolor=black, fontcolor=white, label=\"Blockchain\"];\n"
                +       "node[shape=box, styled=filled, fillcolor=lemonchiffon1, color=lightgray];\n"
                +       "edge[color=white];\n\n";
        int x = 1;
        DLNode aux = first;
        while(aux != null){
            graph += "X" + x + "[label=\"" + aux.value.toString() + "\"];\n";
            x++;
            aux = aux.next;
        }
        
        x = 1;
        aux = first;
        while(aux.next != null){
            if(x == 1)
                graph += "X1->X2 [constraint=false, dir=both];\n";
            else
                graph += "X" + x + "->";
            x++;
            aux = aux.next;
        }
        graph += "X" + x + "[dir=both]; \n"
                + "\n}";
        gGenerator.GenerateGraph(graph, "BlockChain.txt");
    }
}
