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

/**
 *
 * @author manuel
 */
public class HashTable {
    
    private int count;                      // Amount of items saved (n)
    private final int SIZE = 45;            // Size of the Hash-Table (m)
    private HSimpleList[] listOfUsers;      // List of users in the table
    
    public HashTable(){
        count = 0;
        listOfUsers = new HSimpleList[SIZE];
    }
    
    public int Hashing(int _id){        
        return (_id % SIZE);
    }
    
    public boolean Login(int _id, String _password){
        
        User userLogin = Search(_id);
        if(userLogin == null)
            return false;
        
        return userLogin.getPassword().equals(_password);
    }
    
    public void EditUser(int _id, String _name, String _lastName, String _career, String _password){
        User editUser = Search(_id);
        if(editUser == null)
            return;
        editUser.setName(_name);
        editUser.setLastName(_lastName);
        editUser.setCareer(_career);
        editUser.setPassword(_password);
    }
    
    public User Search(int _id){
        int index = Hashing(_id);
        if(listOfUsers[index] == null)
            return null;
        HSimpleList.HSLNode returnUs = listOfUsers[index].Search(_id);
        if(returnUs == null)
            return null;
        return returnUs.user;
    }
    
    public void InsertNode(User _newUser){        
        int index = Hashing(_newUser.getId());
        if(listOfUsers[index] == null)
            listOfUsers[index] = new HSimpleList();
        int auxInt = listOfUsers[index].getSize();
        listOfUsers[index].InsertUser(_newUser);
        if(auxInt != listOfUsers[index].getSize())
            count++;
    }
    
    public void DeleteNode(int _id){
        int index = Hashing(_id);
        if(listOfUsers[index] == null)
            return;
        listOfUsers[index].Delete(_id);
        if(listOfUsers[index].getSize() == 0){
            listOfUsers[index] = null;
        }
        count--;
    }
}
