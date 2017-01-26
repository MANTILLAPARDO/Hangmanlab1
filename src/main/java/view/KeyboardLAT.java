/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author andres
 */
public class KeyboardLAT extends Keyboard{
     public JPanel makeKeyboard(){
        keyboardButtonArray = new JButton[27];
        JPanel keyboard = new JPanel();
        keyboard.setLayout(new GridLayout(3,1));
        for(int i=65; i<91; i++){
            keyboardButtonArray[i-65] = new JButton(Character.toString((char) i));
            keyboard.add(keyboardButtonArray[i-65]);
        }
        keyboardButtonArray[26] = new JButton("\u00d1");
        keyboard.add(keyboardButtonArray[26]);
        return keyboard;
    }
}
