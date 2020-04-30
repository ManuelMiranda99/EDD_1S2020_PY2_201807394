/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: ${date?date?string("yyyy")}

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
*/

package project2;

import DS.HashTable.HashTable;
import Interface.Login;

public class Project2 {
    
    public static HashTable hashTable = new HashTable();
    
    public static void main(String[] args) {
        Login l = new Login();
        l.show();
    }
    
}
