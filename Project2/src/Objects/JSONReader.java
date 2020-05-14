/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Objects;

import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import project2.Project2;

/**
 *
 * @author manuel
 */
public class JSONReader {
    
    public JSONReader(){}
    
    public void ReadUserJSON(){
        int count = 0;
        try {
            JSONParser parser = new JSONParser();           
            
            JSONObject json = (JSONObject) parser.parse(new FileReader(OpenFile()));
            
            JSONArray users = (JSONArray) json.get("Usuarios");
            
            for(int i=0; i < users.size(); i++){
                JSONObject jsonO = (JSONObject)users.get(i);
                
                int id = Integer.parseInt(jsonO.get("Carnet").toString());
                String name = jsonO.get("Nombre").toString();
                String lastName = jsonO.get("Apellido").toString();
                String career = jsonO.get("Carrera").toString();
                String pass = jsonO.get("Password").toString();
                
                
                User newUser = new User(id, name, lastName, career, pass);
                
                Project2.hashTable.InsertNode(newUser);
                count++;
            }
            JOptionPane.showMessageDialog(null, "Archivo JSON de usuarios leído con exito. Se leyeron " + count + " usuarios", "System", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo JSON. Verifique su archivo. Se leyeron " + count + " Usuarios", "System", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void ReadBooksJSON(int _idUser){
        int count = 0, countC = 0;
        try {
            JSONParser parser = new JSONParser();
            
            JSONObject json = (JSONObject) parser.parse(new FileReader(OpenFile()));
            
            JSONArray books = (JSONArray) json.get("libros");
            
            for(int i=0; i < books.size(); i++){
                JSONObject jsonO = (JSONObject)books.get(i);
                
                int id = Integer.parseInt(jsonO.get("ISBN").toString());
                String year = jsonO.get("Año").toString();
                String language = jsonO.get("Idioma").toString();
                String title = jsonO.get("Titulo").toString();
                String editorial = jsonO.get("Editorial").toString();
                String author = jsonO.get("Autor").toString();
                String edition = jsonO.get("Edicion").toString();
                String category = jsonO.get("Categoria").toString();
                
                Category _category = new Category(category, _idUser);
                if(Project2.avl.CheckISBN(id))
                    continue;
                Book newBook = new Book(id, title, author, editorial, year, edition, _category, language, _idUser);
                
                count++;
                
                if(Project2.avl.SearchCategory(category) == null){
                    Project2.avl.AddCategory(_category);
                    countC++;
                }
                Project2.avl.SearchCategory(category).getBooks().Insert(newBook.getISBN(), newBook);
            }
            JOptionPane.showMessageDialog(null, "Archivo JSON de libros leído con exito. Se leyeron " + count + " libros y se agregaron " + countC + " Categorias", "System", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer archivo JSON. Verifique su archivo. Se leyeron " + count + " Libros", "System", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private String OpenFile(){
        try {
            JFileChooser jf = new JFileChooser();
            jf.setAcceptAllFileFilterUsed(false);
            jf.setFileFilter(new FileNameExtensionFilter("Archivos *.json", "json"));
            if(jf.showOpenDialog(jf.getParent()) == JFileChooser.APPROVE_OPTION){
                String route = jf.getSelectedFile().getAbsolutePath();
                return route;
            }
        } catch (Exception e) {
            return "";
        }
        return "";
    }
    
}
