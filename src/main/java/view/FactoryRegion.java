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
public abstract class FactoryRegion {
    protected static FactoryRegion inst=null;
    public static void generateFactory(char caracter){
        if(caracter=='U')FactoryUSA.generate();
        else if(caracter=='L')FactoryLAT.generate();
        else if(caracter=='E')FactoryEUR.generate();
    }
    public static FactoryRegion getFactory(){
        return inst;
    }
    public abstract Hangman getHangman();
    public abstract String getDictionary();
    public abstract  Keyboard getKeyboard();
}
