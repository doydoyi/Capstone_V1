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

    addWordPanel(ApplicationControls controller){
        super(controller);
        initComponents();
    }

    @Override
    protected void initComponents() {}

    @Override
    public JPanel getPanel() {
        return mainPanel;
    }

//    @Override
//    void initComponents() {
//        fJapanese = new JTextField("Japanese", 20);
//        fEnglish = new JTextField("English", 20);
//
//        btnBack = createBackButton();
//        btnSave = new JButton("btnSave");
//
//        //----------------------layout----------------------//
//        mainPanel.setLayout(new GridBagLayout());
//        GridBagConstraints cons = new GridBagConstraints(); // <-- Refer to Java Oracle docs for instructions on how to use GridBagLayout <3
//
//        cons.gridx = 0;
//        cons.gridy = 0;
//        mainPanel.add(new JLabel("Japanese:"), cons);
//        cons.gridx = 1;
//        mainPanel.add(fJapanese, cons);
//
//        cons.gridx = 0;
//        cons.gridy = 1;
//        mainPanel.add(new JLabel("English:"), cons);
//        cons.gridx = 1;
//        mainPanel.add(fEnglish, cons);
//
//        cons.gridx = 0;
//        cons.gridy = 2;
//        cons.gridwidth = 2;
//        mainPanel.add(btnSave, cons);
//        cons.gridy = 3;
//        mainPanel.add(btnBack, cons);
//
//        // referenced code logic from StackOverflow...
//        btnSave.addActionListener(e -> {
//            if(fJapanese.getText().equals("")){
//                JOptionPane.showMessageDialog(null, "Both fields must not be empty.");
//            } else {
//                boolean isSuccess = controller.saveWord(
//                        fJapanese.getText(),
//                        fEnglish.getText()
//                );
//                if(isSuccess){
//                    JOptionPane.showMessageDialog(null, "Translation saved.");
//                    fJapanese.setText("");
//                    fEnglish.setText("");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Save Failed. Please check text file. Location: src\\main\\java\\resources\\data\\");
//                }
//            }
//        });
//    }
    private void clrField(){
        fJapanese.setText("");
        fEnglish.setText("");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        new addWordPanel(controller);
    }
}
