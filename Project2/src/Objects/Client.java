/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Objects;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manuel
 */
public class Client implements Runnable{
    
    private final int PORT;                 // Port of the client    
    private final String HOST;              // Address of the client
    private final Object msg;               // Object that the client will send

    public Client(int _port, Object _msg, String _host){
        PORT = _port;
        HOST = _host;
        msg = _msg;
    }
    
    @Override
    public void run() {
        
        ObjectOutputStream out;
        
        try {
            Socket sc = new Socket(HOST, PORT);
            
            out = new ObjectOutputStream(sc.getOutputStream());
            
            out.writeObject(msg);
            
            sc.close();          
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
