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
    /**
     * Converts a name from "Last, First" to "First Last"
     * @param word1 the name in "Last, First" format
     * @return the name in "First Last" format
     */
    public static String convertName(String word1){
        int loc1 = word1.indexOf(",");
        String b1 = word1.substring(0, loc1).trim();
        String b2 = word1.substring(loc1 + 1).trim();
        return b2 + " " + b1;
    }
    /**
     * removes the dashes from a social security number
     * @param word1 the social security number in the format with dashes
     * @return the social security number in the format without dashes
     */
    public static String removeSSN(String word1){
        String c3 = word1.replace("-","");
        return c3;
    }
    /**
     * Converts a date string from MM/DD/YYYY to DD-MM-YYYY
     * @param word1 the date string in "MM/DD/YYYY" format
     * @return the date string in "DD-MM-YYYY" format
     */
    public static String dateString(String word1){ 
        int loc1 = word1.indexOf("/");
        int loc2 = word1.indexOf("/", loc1+1);
        String day = word1.substring(loc1 + 1, loc2);
        String month = word1.substring(0, loc1);
        String year = word1.substring(loc2 + 1);
        return day + "-" + month + "-" + year;
    }
    /**
     * Flips binary digits in a string, changing 0s to 1s and 1s to 0s
     * @param word1 the binary string to flip
     * @return the flipped binary string
     */
    public static String negative(String word1){
        String step1 = word1.replace("0","a");
        String step2 = step1.replace("1","0");
        String step3 = step2.replace("a","1");
        return step3;
    }
    /**
     * Plays the name game with a given name
     * @param word1 the name to use in the name game
     * @return the name game lyrics for the given name
     */
    public static void nameGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name.");
        String word1 = sc.nextLine();
        int loc1 = word1.indexOf(" ");
        String firstName = word1.substring(0, loc1).trim();
        String lastName = word1.substring(loc1).trim();
        String cutWord1 = firstName.substring(1);
        String cutWord2 = lastName.substring(1);
        System.out.println(firstName + ", " + firstName + ", bo- B" + cutWord1);
        System.out.println("Banana-fana fo-F" + cutWord1);
        System.out.println("Fee-fi-mo-M" + cutWord1);
        System.out.println(firstName.toUpperCase() + "! ");
        System.out.println(" ");
        System.out.println("Cent, Cent, bo-B" + cutWord2);
        System.out.println("Banana-fana fo-F" + cutWord2);
        System.out.println("Fee-fi-mo-M" + cutWord2 + " ");
        System.out.println(lastName.toUpperCase() + "!");
        
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

    nameGame();
   }
}
// ello WorldH
// appyh
// h
// Lori Renee Reubenstein
// Taylor Swift
// Bozo the Clown
// 123-45-6789 is 123456789
// 1101000110
// 00000000
// 04/20/2025 becomes 20-04-2025
// 4/2/2025 becomes 2-4-2025
// Enter a name.
// Fifty Cent
// Fifty, Fifty, bo- Bifty
// Banana-fana fo-Fifty
// Fee-fi-mo-Mifty
// FIFTY!

// Cent, Cent, bo-Bent
// Banana-fana fo-Fent
// Fee-fi-mo-Ment
// CENT!