/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author andres
 */
public class HangmanEUR extends Hangman{
    public void paint(int incorrectCount,Graphics g,int panelWidth ,int panelHeight){
        g.setColor(Color.blue);
        g.drawOval((panelWidth/4)+ 10 - (panelHeight / 12),(panelHeight/6),panelHeight/6,panelHeight/6); // Head
        g.fillOval((panelWidth/4)+ 10 - (panelHeight / 12),(panelHeight/6),panelHeight/6,panelHeight/6);
        g.drawOval((panelWidth / 4)-4,(panelHeight/6)*2,panelHeight/6,(panelHeight/6)*2); // Torso
        g.drawLine((panelWidth / 4),((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))+(panelHeight/12)); // Left Arm
        g.drawLine((panelWidth / 4) + 25,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))+(panelHeight/12)); // Right Arm
        g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*4,((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*4) + (panelHeight/18))+(panelHeight/12)); // Left Leg
        g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*4,((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*4) + (panelHeight/18))+(panelHeight/12)); // Right Leg      
        if(incorrectCount > 0){
            g.drawLine((panelWidth / 4)-10,(panelHeight/6)-30,(panelWidth / 4)-10,(panelHeight/6)-15);
            g.drawLine((panelWidth / 4)-10,(panelHeight/6)-5,(panelWidth / 4)-10,(panelHeight/6)-3);
        }
        if(incorrectCount > 1){
           g.drawLine((panelWidth / 4),(panelHeight/6)-32,(panelWidth / 4),(panelHeight/6)-17);
           g.drawLine((panelWidth / 4),(panelHeight/6)-7,(panelWidth / 4),(panelHeight/6)-5);
        }
        if(incorrectCount > 2){
           g.drawLine((panelWidth / 4)+10,(panelHeight/6)-34,(panelWidth / 4)+10,(panelHeight/6)-19);
           g.drawLine((panelWidth / 4)+10,(panelHeight/6)-9,(panelWidth / 4)+10,(panelHeight/6)-7);
        }
        if(incorrectCount > 3){
          g.drawLine((panelWidth / 4),(panelHeight/6)-32,(panelWidth / 4),(panelHeight/6)-17);
           g.drawLine((panelWidth / 4),(panelHeight/6)-7,(panelWidth / 4),(panelHeight/6)-5);
        }
        if(incorrectCount > 4){
           g.drawLine((panelWidth / 4)+20,(panelHeight/6)-34,(panelWidth / 4)+20,(panelHeight/6)-19);
           g.drawLine((panelWidth / 4)+20,(panelHeight/6)-9,(panelWidth / 4)+20,(panelHeight/6)-7);
        }
        if(incorrectCount > 5){
           g.drawLine((panelWidth / 4)+30,(panelHeight/6)-30,(panelWidth / 4)+30,(panelHeight/6)-15);
           g.drawLine((panelWidth / 4)+30,(panelHeight/6)-5,(panelWidth / 4)+30,(panelHeight/6)-3);
        }
    }   
}
