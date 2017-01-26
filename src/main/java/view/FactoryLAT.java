/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.view;

/**
 *
 * @author andres
 */
public class FactoryLAT extends FactoryRegion{
     private FactoryLAT(){}
    public static void generate(){
        if (inst==null){
            inst=new FactoryLAT();
        }
    }
    public  Hangman getHangman(){
        return (new HangmanLAT());
    }
    public String getDictionary(){
        return ("dictionaryLAT.txt");
    }
    public Keyboard getKeyboard(){
        return (new KeyboardLAT());
    }
    
}
