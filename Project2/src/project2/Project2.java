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
import Objects.Category;

public class Project2 {
    
    public static void main(String[] args) {
        Category newC;
        AVL avl = new AVL();
        
        newC = new Category("Consulta", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Informativos", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Literatura", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Literatura", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Ensayo", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Lirico", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Drama", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Revista", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Sagas", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Biografia", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Epico", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Novela", 201807394);
        avl.AddCategory(newC);
        
        newC = new Category("Manga", 201807394);
        avl.AddCategory(newC);
        
    }
    
}
