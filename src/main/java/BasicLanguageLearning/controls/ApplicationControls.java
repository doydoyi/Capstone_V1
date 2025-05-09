package main.java.BasicLanguageLearning.controls;

import main.java.BasicLanguageLearning.models.JapaneseToEnglishWordRepo;
import main.java.BasicLanguageLearning.models.JapaneseWords;
import main.java.BasicLanguageLearning.panels.frontPanel;
import main.java.BasicLanguageLearning.panels.menuPanel;
import main.java.BasicLanguageLearning.panels.addWordPanel;

import javax.swing.*;
import java.awt.*;

public class ApplicationControls {
    public static final String FRONT_PANEL_TEXT = "FRONT";
    public static final String MENU_PANEL_TEXT = "MENU";
    public static final String ADD_WORD_PANEL_TEXT = "ADD";
    public static final String WORD_PANEL_TEXT = "WORD";
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
        addWordPanel pAddWord = new addWordPanel(this);
        System.out.println("Is Front panel null?: " + (pFront.getPanel() == null));
        System.out.println("Is Menu panel null?: " + (pMenu.getPanel() == null));
        System.out.println("Is Add Word panel null?: " + (pAddWord.getPanel() == null));

        if(pFront.getPanel() != null && pMenu.getPanel() != null){
            mainContainer.add(pFront.getPanel(), FRONT_PANEL_TEXT);
            mainContainer.add(pMenu.getPanel(), MENU_PANEL_TEXT);
            mainContainer.add(pAddWord.getPanel(), ADD_WORD_PANEL_TEXT);
            System.out.println("Panels are now initialized");
            frame.pack();
            frame.setVisible(true);
        } else {
            System.out.println("Failed initialization of panels");
            JOptionPane.showMessageDialog(null,
                    "Panel initialization failed. Check: \n"
                    + "1. Form file component binds.\n"
                    + "2. Custom creation code."
            );
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
