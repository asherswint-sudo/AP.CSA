package AfterTest;

public class DoubleWordChecker extends WordChecker {

    public DoubleWordChecker(String one, String two) {
        super(one, two);
    }
    public boolean andChecker(String word) {
        return firstSubstring(word) && secondSubstring(word);
    }
    public boolean orChecker(String word) {
        return firstSubstring(word) || secondSubstring(word);
    }
    public String toString() {
        return "Double Double words " + super.toString() + " are fun.";
    }
}
