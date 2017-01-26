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
public class KeyboardEUR extends Keyboard{
    public JPanel makeKeyboard(){
        keyboardButtonArray = new JButton[31];
        JPanel keyboard = new JPanel();
        keyboard.setLayout(new GridLayout(3,1));
        for(int i=65; i<91; i++){
            keyboardButtonArray[i-65] = new JButton(Character.toString((char) i));
            keyboard.add(keyboardButtonArray[i-65]);
        }
        
        keyboardButtonArray[26] = new JButton(Character.toString((char) 192));
        keyboard.add(keyboardButtonArray[26]);
        keyboardButtonArray[27] = new JButton(Character.toString((char) 200));
        keyboard.add(keyboardButtonArray[27]);
        keyboardButtonArray[28] = new JButton(Character.toString((char) 204));
        keyboard.add(keyboardButtonArray[28]);
        keyboardButtonArray[29] = new JButton(Character.toString((char) 210));
        keyboard.add(keyboardButtonArray[29]);
        keyboardButtonArray[30] = new JButton(Character.toString((char) 217));
        keyboard.add(keyboardButtonArray[30]);
        return keyboard;
    }
}
