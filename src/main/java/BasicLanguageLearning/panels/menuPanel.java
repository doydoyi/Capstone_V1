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
    public JPanel getPanel() {
        return mainPanel;
    }

    @Override
    void initComponents() {
        phrasesButton = new JButton("Phrases");
        wordsButton = new JButton("Words");
        addWordButton = new JButton("Add a word");


        phrasesButton.addActionListener(e -> controller.navigate("PHRASE_PANEL"));
        wordsButton.addActionListener(e -> controller.navigate("ADD_WORD_PANEL"));

        mainPanel.add(phrasesButton);
        mainPanel.add(wordsButton);
        mainPanel.add(addWordButton);
    }
}
