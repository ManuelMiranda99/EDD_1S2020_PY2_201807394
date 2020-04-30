/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.BTree;

import Objects.Book;
import Objects.Category;

/**
 *
 * @author manuel
 */
public class BTreeNode {
    public Book[] books;
    private final int t;
    public BTreeNode[] childs;
    public int count;
    private boolean leaf;

    public BTreeNode(int _t, boolean _leaf) {
        this.t = _t;
        this.leaf = _leaf;
        this.books = new Book[2*t - 1];
        this.childs = new BTreeNode[2*t];
        this.count = 0;
    }        
    
    public Book SearchByISBN(int _ISBN){
        int i = 0;
        
        while(i < count && _ISBN > books[i].getISBN())
            i++;
        
        if(books[i].getISBN() == _ISBN)
            return this.books[i];
        
        if(leaf)
            return null;
        
        return childs[i].SearchByISBN(_ISBN);
    }
    
    public void EditBook(int _ISBN, String _title, String _author, String _editorial,
                         String _year, String _edition, Category _category, String _language){
        Book bookToEdit = SearchByISBN(_ISBN);
        
        if(bookToEdit == null)
            return;
        
        bookToEdit.setAuthor(_author);
        bookToEdit.setCategory(_category);
        bookToEdit.setEdition(_edition);
        bookToEdit.setEditorial(_editorial);
        bookToEdit.setLanguage(_language);
        bookToEdit.setTitle(_title);
        bookToEdit.setYear(_year);
    }
    
    public void InsertNonFullNode(Book newBook){
        int i = count-1;
        
        if(leaf){
            
            while(i >= 0 && books[i].getISBN() > newBook.getISBN()){
                books[i+1] = books[i];
                i--;
            }
            
            books[i+1] = newBook;
            count++;
            
        }
        else{
            
            while(i >= 0 && books[i].getISBN() > newBook.getISBN())
                i--;
            
            if(childs[i+1].IsFull()){
                SplitChild(i+1, childs[i+1]);
                
                if(books[i+1].getISBN() < newBook.getISBN())
                    i++;
            }
            
            childs[i+1].InsertNonFullNode(newBook);
        }
    }
    
    public void SplitChild(int _index, BTreeNode root){
        BTreeNode newNode = new BTreeNode(root.t, root.leaf);
        newNode.count = t-1;
        
        for(int i=0; i < t-1; i++)
            newNode.books[i] = root.books[i+t];
        
        if(!root.leaf){
            for(int i=0; i < t; i++)
                newNode.childs[i] = root.childs[i+t];
        }
        
        root.count = t-1;
        
        for(int i = count; i >= _index + 1; i--)
            childs[i+1] = childs[i];
        
        childs[_index+1] = newNode;
        
        for(int i=count-1; i >= _index; i--)
            books[i+1] = books[i];
        
        books[_index] = root.books[t-1];
        
        count++;
    }
    
    
    public void IncrementNodes(){
        this.count++;
    }
    
    public boolean IsFull(){
        return (this.count == 2*t -1);
    }
}
