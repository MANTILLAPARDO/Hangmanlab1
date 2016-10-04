/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author Omar
 */
public class FunctionPanel extends JPanel{
    private JButton playButton;
    private JButton highScoresButton;
    private JButton creditsButton;
    
    private ImageIcon small;
    private ImageIcon medium;
    private ImageIcon large;
    private int currentSize; //1 for large, 2 for medium, 3 for small
    
    private JLabel imageLabel;
    private static final Font BUTTON_FONT = new Font("Arial Black", Font.BOLD, 20);
    private static final Border BUTTON_BORDER = BorderFactory.
            createCompoundBorder(BorderFactory.createEmptyBorder(5,5,5,5),
                    BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.WHITE,Color.GRAY));
    
    public FunctionPanel() { 
        try{
            small = new ImageIcon(getClass().getClassLoader().getResource("images/logo_small.png"));
            medium = new ImageIcon(getClass().getClassLoader().getResource("images/logo_medium.png"));
            large = new ImageIcon(getClass().getClassLoader().getResource("images/logo_large.png"));
            imageLabel = new JLabel(small);
            currentSize = 3;
        }catch(Exception e){
            imageLabel = new JLabel();
        }
        initComponents();
    }

    public JButton getPlayButton() {
        return playButton;
    }

    public JButton getHighScoresButton() {
        return highScoresButton;
    }

    public JButton getCreditsButton() {
        return creditsButton;
    }
    
    public void changeImageSize(int size){
        if(size != currentSize){
            if(size == 1){
                imageLabel.setIcon(large);
                currentSize = 1;
            } else if (size == 2){
                imageLabel.setIcon(medium);
                currentSize = 2;
            } else {
                imageLabel.setIcon(small);
                currentSize = 3;
            }
        }
    }
                        
    private void initComponents() {
        setBackground(Color.BLACK);
        
        setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        gridConstraints.fill = GridBagConstraints.BOTH;
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 1;
        gridConstraints.gridheight = 3;
        gridConstraints.weightx = .66;
        gridConstraints.weighty = 1;
        this.add(imageLabel, gridConstraints);
        
        JPanel placeholderPanel = new JPanel();
        placeholderPanel.setBackground(Color.BLACK);
        gridConstraints.fill = GridBagConstraints.BOTH;
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 1;
        gridConstraints.gridheight = 2;
        gridConstraints.weightx = .33;
        gridConstraints.weighty = .66;
        this.add(placeholderPanel, gridConstraints);
        
        playButton = new JButton("Play");
        playButton.setBackground(Color.BLACK);
        playButton.setForeground(Color.WHITE);
        playButton.setFont(BUTTON_FONT);
        playButton.setBorder(BUTTON_BORDER);
        highScoresButton = new JButton("Highscores");
        highScoresButton.setBackground(Color.BLACK);
        highScoresButton.setForeground(Color.WHITE);
        highScoresButton.setFont(BUTTON_FONT);
        highScoresButton.setBorder(BUTTON_BORDER);
        creditsButton = new JButton("Credits");
        creditsButton.setBackground(Color.BLACK);
        creditsButton.setForeground(Color.WHITE);
        creditsButton.setFont(BUTTON_FONT);
        creditsButton.setBorder(BUTTON_BORDER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,1));
        buttonPanel.add(playButton);
        buttonPanel.add(highScoresButton);
        buttonPanel.add(creditsButton);
        gridConstraints.fill = GridBagConstraints.BOTH;
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        gridConstraints.gridwidth = 1;
        gridConstraints.gridheight = 1;
        gridConstraints.weightx = .33;
        gridConstraints.weighty = .33;
        this.add(buttonPanel, gridConstraints);
    }
}