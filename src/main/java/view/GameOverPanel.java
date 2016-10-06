/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author Marc
 */
public class GameOverPanel extends JPanel {
    private JLabel gameOverLabel;
    private JLabel scoreLabel;
    private JButton button1;
    private JButton button2;
    
    private static final Font BUTTON_FONT = new Font("Arial Black", Font.BOLD, 15);
    private static final Border BUTTON_BORDER = BorderFactory.
            createCompoundBorder(BorderFactory.createEmptyBorder(5,5,5,5),
                    BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.WHITE,Color.GRAY));
    
    public GameOverPanel() {
        this.initComponents();
    }
    
    public JButton getResetButton() {
        return this.button1;
    }
    
    public JButton getMenuButton() {
        return this.button2;
    }

    private void initComponents() {
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setBackground(Color.BLACK);

        
        gameOverLabel = new JLabel();
        gameOverLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        gameOverLabel.setText("Game Over");
        gameOverLabel.setFont(new java.awt.Font("Arial Black", 0, 36));
        gameOverLabel.setForeground(new java.awt.Color(255, 255, 255));
        gameOverLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        gameOverLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.add(gameOverLabel);
        
        scoreLabel = new JLabel();
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        scoreLabel.setText("Final Score: Placeholder");
        scoreLabel.setFont(new java.awt.Font("Arial", 0, 24));
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.add(this.scoreLabel);
        
        button1 = new JButton("New Game");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setFont(BUTTON_FONT);
        button1.setBorder(BUTTON_BORDER);
        this.add(button1);
        
        button2 = new JButton("Main Menu");
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFont(BUTTON_FONT);
        button2.setBorder(BUTTON_BORDER);
        this.add(button2);
    }

    public JLabel getGameOverLabel() {
        return gameOverLabel;
    }

    public void setGameOverLabel(JLabel gameOverLabel) {
        this.gameOverLabel = gameOverLabel;
    }

    public JLabel getScoreLabel() {
        return scoreLabel;
    }

    public void setScoreLabel(JLabel scoreLabel) {
        this.scoreLabel = scoreLabel;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }
    
}
