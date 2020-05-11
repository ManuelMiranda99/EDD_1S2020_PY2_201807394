/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.SimpleList;

/**
 *
 * @author manuel
 */
public class SLNode {
    public SLNode next;
    public Object value;
    
    public SLNode(Object _value){
        value = _value;
        next = null;
    }
}
