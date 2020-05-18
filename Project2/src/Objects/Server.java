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
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manuel
 */
public class Server extends Observable implements Runnable{
    
    private int PORT;
    
    public Server(int _PORT){
        PORT = _PORT;
    }

    @Override
    public void run() {
        ServerSocket server = null;
        Socket sc = null;
        ObjectInputStream in;
        
        try {
            server = new ServerSocket(PORT);
            
            System.out.println("Server!");
            
            while(true){
                sc = server.accept();
                // Connected client
                
                in = new ObjectInputStream(sc.getInputStream());
                
                Object msg = in.readObject();
                // Recieved object
                
                this.setChanged();
                this.notifyObservers(msg);
                this.clearChanged();
                
                sc.close();
                // Desconnected client
            }            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
