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
public class FactoryUSA extends FactoryRegion{
    private  FactoryUSA(){}
    public static void generate(){
        if (inst==null){
            inst=new FactoryUSA();
        }
    }
    public  Hangman getHangman(){
        return (new HangmanUSA());
    }
    public String getDictionary(){
        return ("dictionaryUSA.txt");
    }
    public Keyboard getKeyboard(){
        return (new KeyboardUSA());
    }
    
}
