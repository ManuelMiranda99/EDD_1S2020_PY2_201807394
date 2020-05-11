/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Objects;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author manuel
 */
public class GraphvizGenerator {
    public GraphvizGenerator(){}
    
    // Generate image in the place where the project generates
    public void GenerateGraph(String _dot, String _name){        
        try {            
            File file = new File(_name);
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
        } catch (Exception e) {
        }
    }
}
