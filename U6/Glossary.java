import java.util.ArrayList;

public class Glossary {
    static ArrayList<GlossaryEntry> a = new ArrayList<>();
    
    public int foundOrInserted(String s){
    s = s.toUpperCase();
    if (a.size() == 0) {
        a.add(new GlossaryEntry(s));
        return 0;
    }
    for (int x = a.size() - 1; x >= 0; x--) {
        String b = a.get(x).getWord(); 
        int cmp = b.compareTo(s);
        if (cmp == 0) return x;               
        if (cmp < 0) {                        
            a.add(x + 1, new GlossaryEntry(s));
            return x + 1;
        }
    }
    a.add(0, new GlossaryEntry(s));
    return 0;
    }



    public static void main(String[] args) {
        Glossary test = new Glossary();
        test.foundOrInserted("hello");
        test.foundOrInserted("avacado");
        test.foundOrInserted("krish");
        test.foundOrInserted("welcome");
        test.foundOrInserted("stupid");
        test.foundOrInserted("");
        int y = 0;
        for (GlossaryEntry words : a) {
        System.out.println(words + " " + y);
        y++;
        }
    }
}
