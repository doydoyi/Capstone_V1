package main.java.BasicLanguageLearning.controls;

import main.java.BasicLanguageLearning.models.JapaneseToEnglishWordRepo;
import main.java.BasicLanguageLearning.models.JapaneseWords;
import main.java.BasicLanguageLearning.panels.frontPanel;
import main.java.BasicLanguageLearning.panels.menuPanel;

import javax.swing.*;
import java.awt.*;

public class ApplicationControls {
    public static final String FRONT_PANEL_TEXT = "FRONT";
    public static final String MENU_PANEL_TEXT = "MENU";
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainContainer;
    private final JapaneseToEnglishWordRepo wRepository;


    public ApplicationControls(JapaneseToEnglishWordRepo wRepository){
        this.wRepository = wRepository;
        initFrame();
        initPanels();
    }
    private void initFrame(){
        frame = new JFrame("Basic Japanese Language Learning.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayout = new CardLayout();
        mainContainer = new JPanel(cardLayout); //JPanel main container to manage cardlayout for java swing.
        frame.setContentPane(mainContainer);
    }

    private void initPanels(){
        frontPanel pFront = new frontPanel(this);
        menuPanel pMenu = new menuPanel(this);
        System.out.println("Front panel null?: " + (pFront.getPanel() == null));
        System.out.println("Front panel null?: " + (pMenu.getPanel() == null));

        if(pFront.getPanel() != null && pMenu.getPanel() != null){
            mainContainer.add(pFront.getPanel(), FRONT_PANEL_TEXT);
            mainContainer.add(pMenu.getPanel(), MENU_PANEL_TEXT);
            frame.pack();
            frame.setVisible(true);
        } else {
            System.out.println("Failed initialization of panels");
        }


    }

    public void navigate(String panelName){
        cardLayout.show(mainContainer, panelName);
    }

    public boolean saveWord(String japanese, String english){
        wRepository.saveWord(new JapaneseWords(japanese, english));
        return true;
    }
}
