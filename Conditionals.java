public class Conditionals {
    
    public static boolean freshmanTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }

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

    public static boolean onesDigitSame(int a, int b, int c){
        a %= 10;
        b %= 10;
        c %= 10;
        boolean m = (a == b || a == c || c == a);
        return m;
    }

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

    public static String popBang(String str){
        String isP = str.substring(0,1);
        String isB = str.substring(str.length()-1);
        if (isP = "p" && isB = "b"){
            return "PopBang";
        if 
        }

        return isB;
    }

    public static void main(String[] args) {
        System.out.println("Freshman trouble:");
        // System.out.println(freshmanTrouble(true, true));
        // System.out.println(freshmanTrouble(false, false));
        // System.out.println(freshmanTrouble(true, false));
        // System.out.println(freshmanTrouble(false, true));
        System.out.println("Negative positive:");
        // System.out.println(negPos(1, -1, false));
        // System.out.println(negPos(-1, 1, false));
        // System.out.println(negPos(1, 1, false));
        // System.out.println(negPos(-1, -1, false));
        // System.out.println(negPos(-4, -5, true));
        // System.out.println(negPos(-4, 5, true));
        // System.out.println(negPos(4, 5, true));
        // System.out.println(negPos(4, -5, true));
        System.out.println("Pick up phone:");
        // System.out.println(pickUpPhone(false, false, true));
        // System.out.println(pickUpPhone(true, true, true));
        // System.out.println(pickUpPhone(true, true, false));
        // System.out.println(pickUpPhone(false, true, false));
        // System.out.println(pickUpPhone(true, false, false));
        // System.out.println(pickUpPhone(false, false, false));
        System.out.println("Set alarm:");
        // System.out.println(setAlarm(1, false));
        // System.out.println(setAlarm(5, false));
        // System.out.println(setAlarm(0, false));
        // System.out.println(setAlarm(2, true));
        // System.out.println(setAlarm(4, true));
        // System.out.println(setAlarm(6, true));
        System.out.println("One digit same:");
        // System.out.println(onesDigitSame(23, 19, 13));
        // System.out.println(onesDigitSame(23, 19, 12));
        // System.out.println(onesDigitSame(23, 19, 3));
        // System.out.println(onesDigitSame(423, 13, 3));
        // System.out.println(onesDigitSame(23, 29, 25));
        System.out.println("Blackjack:");
        // System.out.println(blackjack(19, 21));
        // System.out.println(blackjack(21, 19));
        // System.out.println(blackjack(19, 22));
        // System.out.println(blackjack(8, 8));
        // System.out.println(blackjack(25, 24));
        // System.out.println(blackjack(17, 9));
        // System.out.println(blackjack(12, 18));
        System.out.println("Pop bang:");
        System.out.println(popBang("hello"));


    }
}
    

