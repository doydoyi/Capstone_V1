package models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JapaneseToEnglishWordRepo {
    private final String File_path = "\"D:\\Capstone_V1\\src\\JapToEngDictionary.txt\"";

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
            System.out.println("Japanese to English Dictionary not found.");
        }

        return wordlist;
    };
}
