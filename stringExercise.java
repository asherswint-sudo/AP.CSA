import java.util.Scanner;

public class stringExercise {

    /**
     * takes a string as a parameter, and moves the first character to the end of the string and returns the new string
     * @param word1 input word
     * @return the input word + the first letter at the end
    */
    public static String scroll(String word1){
        String first = word1.substring(0, 1);
        String rest = word1.substring(1);
        return rest + first; 
    }

    public static String convertName(String word1){
        int loc1 = word1.indexOf(",");
        String b1 = word1.substring(0, loc1).trim();
        String b2 = word1.substring(loc1 + 1).trim();
        return b2 + " " + b1;
    }

    public static String removeSSN(String word1){
        String c3 = word1.replace("-","");
        return c3;
    }

    public static String dateString(String word1){ 
        int loc1 = word1.indexOf("/");
        int loc2 = word1.indexOf("/", loc1+1);
        String day = word1.substring(loc1 + 1, loc2);
        String month = word1.substring(0, loc1);
        String year = word1.substring(loc2 + 1);
        return day + "-" + month + "-" + year;
    }
    
    public static String negative(String word1){
        String step1 = word1.replace("0","a");
        String step2 = step1.replace("1","0");
        String step3 = step2.replace("a","1");
        return step3;
    }

    public static String nameGame(String word1){
        int loc1 = word1.indexOf(" ");
        String firstName = word1.substring(0, loc1).trim();
        String lastName = word1.substring(loc1).trim();
        String cutWord1 = firstName.substring(1);
        String line1 = firstName + ", " + firstName + ", bo- B" + cutWord1;
        String line2 = "Banana-fana fo-F" + cutWord1;
        String line3 = "Fee-fi-mo-M" + cutWord1;
        String line4 = firstName.toUpperCase() + "!";
        String part1 = line1 + " " + line2+ " " + line3 + " " + line4;
        return part1;
    }


   public static void main(String[] args) {

    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));

    System.out.println(convertName(" Reubenstein, Lori Renee  	"));
    System.out.println(convertName("Swift,Taylor"));
    System.out.println(convertName("the Clown, Bozo"));


    System.out.println("123-45-6789 is " + removeSSN("123-45-6789"));

    System.out.println(negative("0010111001"));
    System.out.println(negative("11111111"));

    System.out.println("04/20/2025 becomes " + dateString("04/20/2025"));
    System.out.println("4/2/2025 becomes " + dateString("4/2/2025"));

    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word.");
    String word1 = sc.nextLine();
    System.out.println(nameGame(word1));
   }
}
