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
public class KeyboardUSA extends Keyboard{
    public JPanel makeKeyboard(){
        keyboardButtonArray = new JButton[26];
        JPanel keyboard = new JPanel();
        keyboard.setLayout(new GridLayout(3,1));
        for(int i=65; i<91; i++){
            keyboardButtonArray[i-65] = new JButton(Character.toString((char) i));
            keyboard.add(keyboardButtonArray[i-65]);
        }
        return keyboard;
    }
}
