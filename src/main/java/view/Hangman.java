/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.view;

import java.awt.Graphics;

/**
 *
 * @author andres
 */
public abstract class  Hangman {
    public void dibujeHorca(Graphics g,int panelWidth ,int panelHeight){
        g.drawLine(10, panelHeight - 10, (panelWidth / 4) + 10, panelHeight - 10);
        g.drawLine(((panelWidth/4)/2) + 10, panelHeight - 10,((panelWidth/4)/2) + 10, 10);
        g.drawLine(((panelWidth/4)/2) + 10, 10, (panelWidth / 4) + 10, 10);
        g.drawLine((panelWidth / 4) + 10, 10, (panelWidth / 4) + 10, panelHeight / 6);
    }
    public abstract void  paint(int incorrectCount,Graphics g,int panelWidth ,int panelHeight);
}
