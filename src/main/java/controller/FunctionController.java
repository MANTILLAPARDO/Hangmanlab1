/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingproject1.src.main.java.controller;

import swingproject1.src.main.java.model.FunctionModel;
import swingproject1.src.main.java.view.FunctionPanel;

/**
 *
 * @author Omar
 */
public class FunctionController {
    private FunctionPanel panel;
    private FunctionModel model;
    private MainFrameController rootController;
    
    public FunctionController(FunctionPanel panel, FunctionModel model,MainFrameController rootController){
        this.panel = (FunctionPanel) panel;
        this.model = (FunctionModel) model;
        this.rootController = rootController;
        setup();
    }
    private void setup(){
    }
    
    public FunctionPanel getPanel(){
        return panel;
    }
    
}
