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
public class FactoryEUR  extends FactoryRegion {
      private FactoryEUR(){}
    public static void generate(){
        if (inst==null){
            inst=new FactoryEUR();
        }
    }
    public  Hangman getHangman(){
        return (new HangmanEUR());
    }
    public String getDictionary(){
        return ("dictionaryEUR.txt");
    }
    public Keyboard getKeyboard(){
        return (new KeyboardEUR());
    }
    
}
