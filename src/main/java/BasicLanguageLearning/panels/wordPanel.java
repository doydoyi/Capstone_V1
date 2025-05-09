package main.java.BasicLanguageLearning.panels;

import main.java.BasicLanguageLearning.controls.ApplicationControls;
import main.java.BasicLanguageLearning.models.JapaneseWords;

import javax.swing.*;
import java.awt.*;
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

    private void listSetup(){
        DefaultListModel<String> LModel = new DefaultListModel<>();
        List<JapaneseWords> words = controller.getWordRepo().loadWords();
        for(JapaneseWords word : words){
            LModel.addElement(word.getJapaneseWord() + " == " + word.getEnglishTranslation());
        }

        wordList.setModel(LModel);
        wordList.setFont(new Font("SansSerif", Font.PLAIN, 20));
        wordList.setFixedCellHeight(50);
    }

    @Override
    public JPanel getPanel() {
        return mainPanel;
    }

    @Override
    protected void initComponents() {}
}
