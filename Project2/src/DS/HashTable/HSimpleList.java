/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.HashTable;

import Objects.User;
import project2.Project2;


/**
 *
 * @author manuel
 */

public class HSimpleList {
    
    class HSLNode {
        public HSLNode next;
        public User user;

        public HSLNode(User user) {
            this.user = user;
            this.next = null;
        }

    }
    
    private int size;
    private HSLNode root;
    
    public HSimpleList(){
        this.size = 0;
        root = null;
    }

    public int getSize() {
        return size;
    }
    
    public void InsertUser(User _newUser){
        HSLNode _newNode = Search(_newUser.getId());

        if(_newNode != null)                    // Existing user
            return;
        
        _newNode = new HSLNode(_newUser);
        if(root == null){
            root = _newNode;
        }else{
            _newNode.next = root;
        
            root = _newNode;
        }
        size++;
    }
    
    public HSLNode Search(int _id){
        HSLNode aux = root;
        while(aux != null && aux.user.getId() != _id)
            aux = aux.next;
        if(aux != null)
            return aux;
        return null;
    }
    
    public void Delete(int _id){
        HSLNode aux = root;
        HSLNode aux2 = null;
        while(aux != null && aux.user.getId() != _id){
            aux2 = aux;
            aux = aux.next;
        }
        
        if(aux == null)
            return;
        
        if(aux2 == null){
            root = aux.next;
        }else{
            aux2.next = aux.next;
        }        
        Project2.auxiliarBlock.DeleteUser(aux.user);
        size--;
    }
    
    public String GenerateTable(int cell){
        String graph = "";
        HSLNode aux = root;
        while(aux != null){
            
            graph += "\t\t<tr>\n"
                    +   "\t\t\t<td>" + cell + "</td>\n"
                    +   "\t\t\t<td>" + aux.user.getId() + "</td>\n"
                    +   "\t\t\t<td>" + aux.user.getName() + "</td>\n"
                    +   "\t\t\t<td>" + aux.user.getLastName() + "</td>\n"
                    +   "\t\t\t<td>" + aux.user.getCareer() + "</td>\n"
                    +   "\t\t\t<td>" + aux.user.getPasswordMD5() + "</td>\n"
                    + "\t\t</tr>\n";
            
            aux = aux.next;
        }        
        return graph;
    }
}
