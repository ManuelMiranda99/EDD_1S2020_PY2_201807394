/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package DS.DoubleList;

/**
 *
 * @author manuel
 */
public class DLNode {
    public DLNode next, previous;
    public Object value;
    
    public DLNode(Object _value){
        value = _value;
        next = previous = null;
    }
}
