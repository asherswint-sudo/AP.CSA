package AfterTest;

public class Limerick {

    private int numLines;
    public Limerick(){
        numLines = 5;
    }

    public int getNumlines(){
        return numLines;
    }

        public int getSyllables(int line){
        if(line < 3 || line == 5){
            return 9;
        } else if(line == 3 || line == 4){
            return 6;
        }
        return -1;
    }
    
    public void printTa(int n){

        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print('-');
            System.out.print("ta");
        }
    }

    public void printRhythm(){
        for(int i = 1; i <= numLines; i++){
            printTa(getSyllables(i));
            System.out.println();
        }   
    }
}
