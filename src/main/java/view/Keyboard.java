/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.view;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author andres
 */
public abstract class Keyboard {
    protected JButton[] keyboardButtonArray;
    public abstract JPanel makeKeyboard();
    public JButton[] getKeyboardButtonArray() {
        return keyboardButtonArray;
    }
}
