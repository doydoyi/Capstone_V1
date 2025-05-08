package main.java.BasicLanguageLearning.panels;

import main.java.BasicLanguageLearning.controls.ApplicationControls;

import javax.swing.*;
import java.awt.*;

public class frontPanel extends Base{
    private JPanel mainPanel;
    private JButton startButton;
    private JLabel title;

    public frontPanel(ApplicationControls controller){
        super(controller);
    }

    public JPanel getPanel(){
        return mainPanel;
    }

    @Override
    void initComponents() {
        title = new JLabel("Learn Japanese");
        startButton = new JButton("Start");

        //bind from brain or 'controller';

        startButton.addActionListener(e -> {
            controller.navigate(ApplicationControls.mPanel);
        });

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(title, BorderLayout.CENTER);
    }
}
