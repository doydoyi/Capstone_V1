package main.java.BasicLanguageLearning.panels;
import main.java.BasicLanguageLearning.controls.ApplicationControls;

import javax.imageio.stream.ImageInputStreamImpl;
import javax.print.attribute.standard.JobPriority;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class addWordPanel extends Base{

    private JTextField fJapanese;
    private JTextField fEnglish;
    private JButton btnBack;
    private JButton btnSave;
    private JPanel mainPanel;
    private JLabel lbJapanese;
    private JLabel lbEnglish;
    String japanese, english;
    private boolean isSuccessful;

    public addWordPanel(ApplicationControls controller){
        super(controller);
        btnBack.addActionListener(e -> controller.navigate(ApplicationControls.MENU_PANEL_TEXT));
        actions();
    }

    private void actions() {
        btnSave.addActionListener(e -> {
            japanese = fJapanese.getText().trim();
            english = fEnglish.getText().trim();

            if(japanese.isEmpty() || english.isEmpty()){
                JOptionPane.showMessageDialog(
                        mainPanel,
                        "Both fields must be filled!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            try {
                isSuccessful = controller.saveWord(japanese, english);
                if(isSuccessful){
                    JOptionPane.showMessageDialog(mainPanel, "Saved!", "Successful", JOptionPane.INFORMATION_MESSAGE
                    );
                    fJapanese.setText("");
                    fEnglish.setText("");
                    controller.navigate(ApplicationControls.WORD_PANEL_TEXT);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(mainPanel, "Failed to save.", "Unable to save.", JOptionPane.ERROR_MESSAGE);
            }
        });
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
}
