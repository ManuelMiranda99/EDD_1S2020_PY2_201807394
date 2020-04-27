/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Objects;

public class User {

    /*
        Atributes
    */
    private final int id;
    private String name;
    private String lastName;
    private String career;
    private String password;
    
    public User(int _id, String _name, String _lastName,
                String _career, String _password) {
        this.id = _id;
        this.name = _name;
        this.lastName = _lastName;
        this.career = _career;
        this.password = _password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
