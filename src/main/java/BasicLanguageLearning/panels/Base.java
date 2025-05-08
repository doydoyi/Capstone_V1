package main.java.BasicLanguageLearning.panels;

import javax.swing.*;

public abstract class Base {
    public abstract JPanel getPanel();


    //Method to be used in multiple panels for easy navigation.
    protected JButton createBackButton() {
        JButton bttn = new JButton("Back");
        bttn.addActionListener(event -> controller.navigateToMenu());
        return bttn;
    }

}
