package AfterTest;
public class Poem{
    private int numlines;
    public Poem(int n){
        numlines = n;
    }
    public int getNumlines(){
        return numlines;
    }
    public void printRhythm(){
        System.out.println("Free Verse!");
    }

}