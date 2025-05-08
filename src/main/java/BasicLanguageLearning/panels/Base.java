package main.java.BasicLanguageLearning.panels;

import main.java.BasicLanguageLearning.controls.ApplicationControls;

import javax.swing.*;

public abstract class Base {
    protected ApplicationControls controller;
    public abstract JPanel getPanel();
    private static final String menuPanel = "MENU";

    Base(ApplicationControls controller){
        this.controller = controller;
    }


    //Method to be used in multiple panels for easy navigation.
    protected JButton createBackButton() {
        JButton bttn = new JButton("Back");
        bttn.addActionListener(event -> controller.navigate(menuPanel));
        return bttn;
    }
    protected abstract void initComponents();
}
