package main.java.BasicLanguageLearning.models;

import javax.swing.*;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class JapaneseToEnglishWordRepo {
    private String File_path;

    public JapaneseToEnglishWordRepo(String File_path) {
        this.File_path = File_path;
    }

    //Load external Dictionary
    public List<JapaneseWords> loadWords(){
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

    public boolean saveWord(JapaneseWords japaneseWords) throws IOException {
        try (FileWriter fWriter = new FileWriter(File_path, true);
             BufferedWriter bWriter = new BufferedWriter(fWriter)){
            bWriter.write(japaneseWords.getJapaneseWord() + " : " + japaneseWords.getEnglishTranslation());
            bWriter.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error saving word.");
            return false;
        }
    }
}
