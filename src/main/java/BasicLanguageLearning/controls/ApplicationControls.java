package main.java.BasicLanguageLearning.controls;

import main.java.BasicLanguageLearning.models.JapaneseToEnglishWordRepo;
import main.java.BasicLanguageLearning.models.JapaneseWords;
import main.java.BasicLanguageLearning.panels.frontPanel;
import main.java.BasicLanguageLearning.panels.menuPanel;

import javax.swing.*;
import java.awt.*;

public class ApplicationControls {
    private JFrame frame;
    private CardLayout card_Layout;
    private JPanel MainContainer;
    private final JapaneseToEnglishWordRepo wRepository;
    private frontPanel welcomePanel;
    private menuPanel menu;
    public static final String fPanel = "Front...";
    public static final String mPanel = "Menu...";

    public ApplicationControls(JapaneseToEnglishWordRepo wRepository){
        this.wRepository = wRepository;
        initFrame();
        initPanels();
    }
    private void initFrame(){
        frame = new JFrame("Basic Japanese Language Learning.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        card_Layout = new CardLayout();
        MainContainer = new JPanel(card_Layout); //JPanel main container to manage cardlayout for java swing.
        frame.setContentPane(MainContainer);
    }

    private void initPanels(){
        card_Layout = new CardLayout();
        MainContainer = new JPanel(card_Layout);
        frame.setContentPane(MainContainer);
        MainContainer.add(new frontPanel(this).getPanel(), fPanel);
        MainContainer.add(new menuPanel(this).getPanel(), mPanel);
    }
    public void navigate(String panelName){
        card_Layout.show(MainContainer, panelName);
    }

    public boolean saveWord(String japanese, String english){
        wRepository.saveWord(new JapaneseWords(japanese, english));
        return true;
    }

}
