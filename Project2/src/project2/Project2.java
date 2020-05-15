/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: ${date?date?string("yyyy")}

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
*/

package project2;

import DS.AVL.AVL;
import DS.HashTable.HashTable;
import Interface.Login;
import Objects.GraphvizGenerator;
import Objects.User;

public class Project2 {
    
    public static HashTable hashTable = new HashTable();
    public static AVL avl = new AVL();
    public static User actualUser;
    public static GraphvizGenerator gGenerator = new GraphvizGenerator();
    public static boolean state = false;
    public static String IP = "";
    
    public static void main(String[] args) {
        Login l = new Login();
        l.show();
    }
    
}
