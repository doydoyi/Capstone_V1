package main.java.BasicLanguageLearning.controls;

import main.java.BasicLanguageLearning.panels.MenuPanel;
import main.java.BasicLanguageLearning.panels.FrontPanel;


import javax.swing.*;
import java.awt.*;

public class ApplicationControls {
    private JFrame frame;
    private CardLayout card_Layout;
    private JPanel MainContainer;

    private FrontPanel welcomePanel;
    private MenuPanel menuPanel;

    public ApplicationControls(){
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
        welcomePanel = new FrontPanel(this);
        menuPanel = new Menu();
    }
}
