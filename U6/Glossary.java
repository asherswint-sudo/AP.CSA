import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Glossary {
    static ArrayList<GlossaryEntry> a = new ArrayList<>();
    
    public  int foundOrInserted(String s){
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

    public void addWord(String word, int line) {
        if (word.isEmpty()) return;
        int b = foundOrInserted(word);
        GlossaryEntry entry  = a.get(b);
        entry.add(line);
    


    }

    public void addAllWords(String textLine, int lineNumber) {
        String[] parts = textLine.split(" ");
        for(int x = 0; x < parts.length; x++){
            addWord(parts[x], lineNumber);
        }
    }

    public void printEntries() {

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }



    public static void main(String[] args) throws IOException {
        File inputfile = new File("U6/fish.txt");
        Scanner input = new Scanner(inputfile);

        Glossary test = new Glossary();
        int i = 1;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            
            test.addAllWords(line, i);
            i++;
        }
        input.close();
        test.printEntries();
    }
}

// Output:
// A 12 14 15
// ARE 16
// BLACK 6
// BLUE 4 7
// CAR 14
// FISH 1 2 3 4 6 7 8 9 16
// HAS 11 14
// LITTLE 12 14
// LOT 15
// NEW 9
// OF 16
// OLD 8
// ONE 1 11 14
// RED 3
// SAY 15
// STAR 12
// THERE 16
// THIS 11 14
// TWO 2
// WHAT 15
