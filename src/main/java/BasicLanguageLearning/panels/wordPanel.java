package main.java.BasicLanguageLearning.panels;

import main.java.BasicLanguageLearning.controls.ApplicationControls;
import main.java.BasicLanguageLearning.models.JapaneseWords;

import javax.swing.*;
import java.util.List;

public class wordPanel extends Base{
    private JPanel mainPanel;
    private JList<String> wordList;
    private JScrollPane scrollPane;
    private JButton backButton;

    public wordPanel(ApplicationControls controller) {
        super(controller);
        backButton.addActionListener(e -> controller.navigate(ApplicationControls.MENU_PANEL_TEXT));
    }
//
//    private void setupList(){
//        List<JapaneseWords> jWord = controller.getWordRepo
//    }

    @Override
    public JPanel getPanel() {
        return mainPanel;
    }

    @Override
    protected void initComponents() {}
}
