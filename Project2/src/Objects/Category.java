/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Objects;

/**
 *
 * @author manuel
 */
public class Category {
    private final String name;
    private int count;
    private final int userID;

    public Category(String name, int userID) {
        this.name = name;
        this.userID = userID;
        this.count = 0;
    }
    
    public void AddBook(){
        this.count++;
    }
    
    public void DeleteBook(){
        this.count--;
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }
    
}
