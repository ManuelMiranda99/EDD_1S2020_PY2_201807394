/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Objects;

import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author manuel
 */
public class GraphvizGenerator {
    
    private String lastPNG = "";
    public GraphvizGenerator(){}
    
    // Generate image in the place where the project generates
    public void GenerateGraph(String _dot, String _name){        
        try {
            File dir = new File("appLibrary//Reports");
            dir.mkdirs();
            
            File file = new File(dir.getAbsoluteFile() + "/" + _name);
            file.setWritable(true);            

            String routePNG = "";
            for(String var : file.getAbsolutePath().split("/")){
                if(var.contains(".txt")){                    
                    routePNG += var.subSequence(0, var.length() - 4) + ".png";                    
                    break;
                }else{
                    routePNG += var + "/";
                }                
            }
            FileWriter writer = new FileWriter(file);
            writer.write(_dot);
            writer.close();                       
            
            ProcessBuilder p = new ProcessBuilder("dot", "-Tpng", "-o", routePNG, file.getAbsolutePath());
            p.start();
            
            this.lastPNG = routePNG;
            
        } catch (Exception e) {
        }
    }
    
    public void PutInLabel(JLabel lbl){
        try {
            sleep(1500);                        
            lbl.setIcon(new ImageIcon(lastPNG));
        } catch (Exception e) {
        }        
    }
}
