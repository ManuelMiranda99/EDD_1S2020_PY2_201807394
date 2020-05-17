/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Objects;

import DS.SimpleList.SLNode;
import DS.SimpleList.SimpleList;
import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import static project2.Project2.blockchain;

/**
 *
 * @author manuel
 */
public class Block {
    
    private int INDEX;
    private String TIMESTAMP;
    private SimpleList DATA = new SimpleList();
    private int NONCE;
    private String PREVIOUSHASH;
    private String HASH;
    
    public Block(){
        INDEX = 0;
        PREVIOUSHASH = "0000";
    }

    public Block(int INDEX, String TIMESTAMP, int NONCE, String HASH, String PREVIOUSHASH) {
        this.TIMESTAMP = TIMESTAMP;
        this.NONCE = NONCE;
        this.HASH = HASH;
        this.INDEX = INDEX;
        this.PREVIOUSHASH = PREVIOUSHASH;
    }
    
    @Override
    public String toString(){
        return "INDEX: " + INDEX + "-TIMESTAMP: " + TIMESTAMP + "-NONCE: " + NONCE + "-HASH: " + HASH + "-Operaciones: " + DATA.size;
    }
    
    public void CreateUser(User user){
        JSONObject json = new JSONObject();
        
        json.put("Carnet", user.getId());
        json.put("Nombre", user.getName());
        json.put("Apellido", user.getLastName());
        json.put("Carrera", user.getCareer());
        json.put("Password", user.getPassword());
        
        JSONArray array = new JSONArray();
        array.add(json);
        
        JSONObject last = new JSONObject();
        last.put("CREAR_USUARIO", array);
        
        DATA.InsertLast(last);
    }
    
    public void DeleteUser(User user){
        JSONObject json = new JSONObject();
        
        json.put("Carnet", user.getId());
        json.put("Nombre", user.getName());
        json.put("Apellido", user.getLastName());
        json.put("Carrera", user.getCareer());
        json.put("Password", user.getPassword());
        
        JSONArray array = new JSONArray();
        array.add(json);
        
        JSONObject last = new JSONObject();
        last.put("ELIMINAR_USUARIO", array);
        
        DATA.InsertLast(last);
    }
    
    public void EditUser(User user){
        JSONObject json = new JSONObject();
        
        json.put("Carnet", user.getId());
        json.put("Nombre", user.getName());
        json.put("Apellido", user.getLastName());
        json.put("Carrera", user.getCareer());
        json.put("Password", user.getPassword());
        
        JSONArray array = new JSONArray();
        array.add(json);
        
        JSONObject last = new JSONObject();
        last.put("EDITAR_USUARIO", array);
        
        DATA.InsertLast(last);
    }
    
    public void CreateBook(Book book){
        JSONObject json = new JSONObject();
        
        json.put("ISBN", book.getISBN());
        json.put("Año", book.getYear());
        json.put("Idioma", book.getLanguage());
        json.put("Titulo", book.getTitle());
        json.put("Editorial", book.getEditorial());
        json.put("Autor", book.getAuthor());
        json.put("Edicion", book.getEdition());
        json.put("Categoria", book.getCategory().getName());
        json.put("Usuario", book.getUserID());
        
        JSONArray array = new JSONArray();
        array.add(json);
        
        JSONObject last = new JSONObject();
        last.put("CREAR_LIBRO", array);
        
        DATA.InsertLast(last);
    }
    
    public void DeleteBook(Book book){
        JSONObject json = new JSONObject();
        
        json.put("ISBN", book.getISBN());
        json.put("Titulo", book.getTitle());
        json.put("Categoria", book.getCategory().getName());
        
        JSONArray array = new JSONArray();
        array.add(json);
        
        JSONObject last = new JSONObject();
        last.put("ELIMINAR_LIBRO", array);
        
        DATA.InsertLast(last);
    }
    
    public void CreateCategory(Category category){
        JSONObject json = new JSONObject();
        
        json.put("NOMBRE", category.getName());
        json.put("Usuario", category.getUserID());
        
        JSONArray array = new JSONArray();
        array.add(json);
        
        JSONObject last = new JSONObject();
        last.put("CREAR_CATEGORIA", array);
        
        DATA.InsertLast(last);
    }
    
    public void DeleteCategory(Category category){
        JSONObject json = new JSONObject();
        
        json.put("NOMBRE", category.getName());        
        
        JSONArray array = new JSONArray();
        array.add(json);
        
        JSONObject last = new JSONObject();
        last.put("ELIMINAR_CATEGORIA", array);
        
        DATA.InsertLast(last);
    }
    
    private String SHA256(String _hash){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(StandardCharsets.UTF_8.encode(_hash));
            return String.format("%064x", new BigInteger(1, md.digest()));
        } catch (Exception e) {
        }
        return "";
    }
    
    public void GenerateBlock(){
        Calendar obj = Calendar.getInstance();
        TIMESTAMP = new SimpleDateFormat("dd-MM-yyyy::HH:mm:ss").format(obj.getTime());
        // Data to string
        JSONArray arr = new JSONArray();
        SLNode aux = DATA.root;
        while(aux != null){
            arr.add(aux.value);
            aux = aux.next;
        }
        String data = arr.toString();
        NONCE = 0;
        HASH = SHA256(INDEX + TIMESTAMP + PREVIOUSHASH + data + NONCE);        
        while(!HASH.startsWith("0000")){
            //TIMESTAMP = new SimpleDateFormat("dd-MM-yyyy::HH:mm:ss").format(obj.getTime());
            HASH = SHA256(INDEX + TIMESTAMP + PREVIOUSHASH + data + NONCE);
            NONCE++;
        }
        
        JSONObject json = new JSONObject();
        json.put("INDEX", INDEX);
        json.put("TIMESTAMP", TIMESTAMP);
        json.put("NONCE", NONCE);
        json.put("DATA", arr);
        json.put("PREVIOUSHASH", PREVIOUSHASH);
        json.put("HASH", HASH);
        
        blockchain.InsertLast(CopyThis());
        
        // Send to the other nodes
        
        // Create JSON Block
        File dir = new File("appLibrary");
        dir.mkdirs();
        System.out.println(dir.getAbsoluteFile());
        System.out.println(dir.getAbsolutePath());
        try (FileWriter file = new FileWriter(dir.getAbsoluteFile() + "/library.json")){
            file.write(json.toJSONString());
        } catch (Exception e) {
        }
        
        PREVIOUSHASH = HASH;
        INDEX++;
    }
    
    public Block CopyThis(){
        Block newBlock = new Block(INDEX, TIMESTAMP, NONCE, HASH, PREVIOUSHASH);
        
        newBlock.DATA = this.DATA.CopyList();
        
        
        return newBlock;
    }
}
