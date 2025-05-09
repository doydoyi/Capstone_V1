package main.java.BasicLanguageLearning.panels;
import main.java.BasicLanguageLearning.controls.ApplicationControls;
import javax.swing.*;
import java.awt.*;

public class addWordPanel extends Base{

    private JTextField fJapanese;
    private JTextField fEnglish;
    private JButton btnBack;
    private JButton btnSave;
    private JPanel mainPanel;
    private JLabel lbJapanese;
    private JLabel lbEnglish;
//    private boolean isSuccess;

    public addWordPanel(ApplicationControls controller){
        super(controller);
//        initComponents();
    }

    @Override
    protected void initComponents() {}

    @Override
    public JPanel getPanel() {
        return mainPanel;
    }

    private void clrField(){
        fJapanese.setText("");
        fEnglish.setText("");
    }

//    private void createUIComponents() {
//        // TODO: place custom component creation code here
//        new addWordPanel(controller);
//    }
}
