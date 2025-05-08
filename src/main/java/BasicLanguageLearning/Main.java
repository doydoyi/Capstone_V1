package main.java.BasicLanguageLearning;

import main.java.BasicLanguageLearning.controls.ApplicationControls;
import main.java.BasicLanguageLearning.models.JapaneseToEnglishWordRepo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JapaneseToEnglishWordRepo repo = new JapaneseToEnglishWordRepo("D:\\Capstone_V1\\src\\main\\resources\\data\\JapToEngDictionary.txt");
            ApplicationControls controls = new ApplicationControls(repo);
        });
    }
}
