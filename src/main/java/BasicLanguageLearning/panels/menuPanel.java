package main.java.BasicLanguageLearning.panels;

import main.java.BasicLanguageLearning.controls.ApplicationControls;

import javax.swing.*;

public class menuPanel extends Base{
    private JPanel mainPanel;
    private JButton phrasesButton;
    private JButton wordsButton;
    private JButton addWordButton;

    public menuPanel(ApplicationControls controller) {
        super(controller);
    }

    @Override
    protected void initComponents() {}


    @Override
    public JPanel getPanel() {
        return mainPanel;
    }


}
