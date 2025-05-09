package main.java.BasicLanguageLearning.panels;

import main.java.BasicLanguageLearning.controls.ApplicationControls;

import javax.swing.*;

public class frontPanel extends Base{
    private JPanel mainPanel;
    private JButton startButton;
    private JLabel titleLabel;

    public frontPanel(ApplicationControls controller){
        super(controller);
        startButton.addActionListener(e -> controller.navigate(ApplicationControls.MENU_PANEL_TEXT));
    }

    @Override
    public JPanel getPanel(){
        return mainPanel;
    }

    @Override
    protected void initComponents() {}
}
