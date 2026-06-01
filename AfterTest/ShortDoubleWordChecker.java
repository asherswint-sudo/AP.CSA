package AfterTest;

public class ShortDoubleWordChecker extends DoubleWordChecker{
    private int length;
    public ShortDoubleWordChecker(String one, String two, int l) {
        super(one, two);
        length = l;
    }
    public ShortDoubleWordChecker(String one, String two) {
        this(one, two, 20);
    }
    public boolean andChecker(String word) {
        return super.andChecker(word) && word.length() < length;   
    }
    public boolean xorChecker(String word){
        return super.orChecker(word) && !super.andChecker(word);
    }
}
