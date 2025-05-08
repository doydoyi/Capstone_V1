package main.java.BasicLanguageLearning.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JapaneseToEnglishWordRepo {
    private String File_path;

    public JapaneseToEnglishWordRepo(String File_path) {
        this.File_path = File_path;
    }

    //Load external Dictionary
    List<JapaneseWords> loadWords(){
        List<JapaneseWords> wordlist = new ArrayList<>();
        try (BufferedReader bReader = new BufferedReader(new FileReader(File_path))) {
            String s;
            while (((s = bReader.readLine()) != null)) /* While(1) */{
                String[] segments = s.split(":");
                if(segments.length == 2){
                    wordlist.add(new JapaneseWords(segments[0], segments[1])); /*Place first parameter to string as Japanese, second segment as an english translation*/
                }
            }
        } catch(IOException e) {
            System.out.println("Japanese to English Dictionary not found." + e.getMessage());
        }

        return wordlist;
    };

    public void saveWord(JapaneseWords japaneseWords) {

    }
}
