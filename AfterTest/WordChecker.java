package AfterTest;

public class WordChecker {
    private String firstWord;
    private String secondWord;

    public WordChecker(String one, String two){
        firstWord = one;
        secondWord = two;
    }
    // returns true if firstWord is a substring of word
    public boolean firstSubstring(String word){
        return word.contains(firstWord);
    }
    // returns true if secondWord is a substring of word
    public boolean secondSubstring(String word){
        return word.contains(secondWord);
    }
    public String toString(){
        return firstWord + " " + secondWord;
    }
}
