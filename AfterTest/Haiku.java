package AfterTest;

public class Haiku {

    private int numLines;
    public Haiku(){
        numLines = 3;
    }

    public int getNumlines(){
        return numLines;
    }

        public int getSyllables(int line){
        if(line == 1 || line == 3){
            return 5;
        } else if(line == 2){
            return 7;
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
