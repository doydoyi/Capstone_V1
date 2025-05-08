package main.java.BasicLanguageLearning.models;

public class JapaneseWords {
    private String japaneseWord;
    private String englishTranslation;

    public JapaneseWords(String japaneseWord,String englishTranslation){
        this.japaneseWord = japaneseWord;
        this.englishTranslation = englishTranslation;
    }

    public String getJapaneseWord() {
        return japaneseWord;
    }
    public String getEnglishTranslation(){
        return englishTranslation;
    }

    public String toString(){
        return "The english for " + getJapaneseWord() + " is " + getEnglishTranslation();
    }
}
