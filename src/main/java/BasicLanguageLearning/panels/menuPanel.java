package main.java.BasicLanguageLearning.panels;

import main.java.BasicLanguageLearning.controls.ApplicationControls;

import javax.swing.*;

public class menuPanel extends Base{
    private JPanel mainPanel;
    private JButton wordsButton;
    private JButton addWordButton;
    private JButton backButton;

    public menuPanel(ApplicationControls controller) {
        super(controller);
        wordsButton.addActionListener(e -> controller.navigate(ApplicationControls.WORD_PANEL_TEXT));
        addWordButton.addActionListener(e -> controller.navigate(ApplicationControls.ADD_WORD_PANEL_TEXT));
        backButton.addActionListener(e -> controller.navigate(ApplicationControls.FRONT_PANEL_TEXT));
    }
    @Override
    public JPanel getPanel() {
        return mainPanel;
    }
}
