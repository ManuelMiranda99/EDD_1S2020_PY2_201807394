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
public class Book {
    private final int ISBN;
    private String title;
    private String author;
    private String editorial;
    private String year;
    private String edition;
    private String category;    // Change to a Category object
    private String language;
    private final int userID;

    public Book(int _ISBN, String _title, String _author, String _editorial, 
            String _year, String _edition, String _category, String _language, 
            int _userID) {
        this.ISBN = _ISBN;
        this.title = _title;
        this.author = _author;
        this.editorial = _editorial;
        this.year = _year;
        this.edition = _edition;
        this.category = _category;
        this.language = _language;
        this.userID = _userID;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getUserID() {
        return userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
}
