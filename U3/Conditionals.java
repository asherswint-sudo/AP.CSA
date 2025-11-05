package U3;
public class Conditionals {
    /**
     * Returns true if both freshman are smiling or neither is smiling.
     * @param aSmile true if freshman A is smiling, false otherwise
     * @param bSmile true if freshman B is smiling, false otherwise
     * @return true if both freshmen are smiling or neither is smiling
     */
    public static boolean freshmanTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }
    /**
     * Returns true if one integer is negative and the other is positive,
     * or both are negative when the negative parameter is true.
     * @param a the first integer
     * @param b the second integer
     * @param negative true if both integers are negative
     * @return true if the integers are in the specified relationship
     */
    public static boolean negPos(int a, int b, boolean negative){
        if (a < 0 && b < 0 && negative){
            return true;
        }
        if ((a < 0 && b > 0 || a > 0 && b < 0) && !negative){
            return true;
        }
        else{
        return false;
        }
    }
    /**
     * Determines if you should pick up the phone 
     * depending on who is calling, what time it is and whether you are asleep.
     * @param isMorning true if it is morning, false otherwise
     * @param isMom true if the caller is your mom, false otherwise
     * @param isAsleep true if you are asleep, false otherwise
     * @return true if you should pick up the phone, false otherwise
     */
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep){
            return false;
        }
        if (isMorning && isMom){
            return true;
        } 
        if (isMorning && !isMom){
            return false;
        } 
        else{
        return true;
        }
    }
    /**
     * Sets the alarm time based on the day of the week and vacation status.
     * @param day the day of the week (1 = Monday, 2 = Tuesday, etc.)
     * @param vacation true if it is a vacation day, false otherwise
     * @return the alarm time as a string
     */
    public static String setAlarm(int day, boolean vacation){
        if (day > 0 && day <= 5 && vacation){
            return "10:00";
        }
        if (day > 0 && day <= 5 && !vacation){
            return "7:00";
        }
        if (!(day > 0 && day <= 5) && vacation){
            return "off";
        }
        if (!(day > 0 && day <= 5) && !vacation){
            return "10:00";
        }
        else{
            return "NOOOO";
        }
    }
    /**
     * Returns true if one integer is negative and the other is positive,
     * or both are negative when the negative parameter is true.
     * @param a the first integer
     * @param b the second integer
     * @param negative true if both integers are negative
     * @return true if the integers are in the specified relationship
     */
    public static boolean onesDigitSame(int a, int b, int c){
        a %= 10;
        b %= 10;
        c %= 10;
        boolean m = (a == b || a == c || c == a);
        return m;
    }
    /**
     * Determines the best score in a game of blackjack.
     * @param a the first player's score
     * @param b the second player's score
     * @return the best score, or 0 if both scores are over 21
     */
    public static int blackjack(int a, int b){
            if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }
        else {
            if (a>b){
                return a;
            }
            else{
                return b;
            }
        }
    }
    /**
     * Returns "Pop" if the string starts with 'p', "Bang" if it ends with 'b',
     * @param str the input string
     * @return the corresponding string based on the input
     */
    public static String popBang(String str){
        String isP = str.substring(0,1);
        String isB = str.substring(str.length()-1);
        if (isP.equals("p") && isB.equals("b")){
            return "PopBang";
        }
        if  (isP.equals("p") && !isB.equals("b")){
            return "Pop";
        }
        if  (!isP.equals("p") && isB.equals("b")){
            return "Bang";
        }
        else {
            return str;
        }

    }

    public static void main(String[] args) {
        System.out.println("Freshman trouble:");
        System.out.println(freshmanTrouble(true, true));
        System.out.println(freshmanTrouble(false, false));
        System.out.println(freshmanTrouble(true, false));
        System.out.println(freshmanTrouble(false, true));
        System.out.println("Negative positive:");
        System.out.println(negPos(1, -1, false));
        System.out.println(negPos(-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos(-1, -1, false));
        System.out.println(negPos(-4, -5, true));
        System.out.println(negPos(-4, 5, true));
        System.out.println(negPos(4, 5, true));
        System.out.println(negPos(4, -5, true));
        System.out.println("Pick up phone:");
        System.out.println(pickUpPhone(false, false, true));
        System.out.println(pickUpPhone(true, true, true));
        System.out.println(pickUpPhone(true, true, false));
        System.out.println(pickUpPhone(false, true, false));
        System.out.println(pickUpPhone(true, false, false));
        System.out.println(pickUpPhone(false, false, false));
        System.out.println("Set alarm:");
        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm(0, false));
        System.out.println(setAlarm(2, true));
        System.out.println(setAlarm(4, true));
        System.out.println(setAlarm(6, true));
        System.out.println("One digit same:");
        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame(23, 19, 12));
        System.out.println(onesDigitSame(23, 19, 3));
        System.out.println(onesDigitSame(423, 13, 3));
        System.out.println(onesDigitSame(23, 29, 25));
        System.out.println("Blackjack:");
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
        System.out.println(blackjack(17, 9));
        System.out.println(blackjack(12, 18));
        System.out.println("Pop bang:");
        System.out.println(popBang("party"));
        System.out.println(popBang("glob"));
        System.out.println(popBang("plumb"));
        System.out.println(popBang("hello"));

    }
}
    

// Output:
// Freshman trouble:
// true
// true
// false
// false
// Negative positive:
// true
// true
// false
// false
// true
// false
// false
// false
// Pick up phone:
// false
// false
// true
// true
// false
// true
// Set alarm:
// 7:00
// 7:00
// 10:00
// 10:00
// 10:00
// off
// One digit same:
// true
// false
// true
// true
// false
// Blackjack:
// 21
// 21
// 19
// 8
// 0
// 17
// 18
// Pop bang:
// Pop
// Bang
// PopBang
// hello