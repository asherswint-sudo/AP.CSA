public class MathEx {
    public static void main(String[] args){
    timeLeft(1,15,4,36);
    timeLeft(1,34,8,20);
    swap(123);
    }

    public static void swap(int num){
    int ones = num % 10;
    int tens = (num % 100)/10;
    System.out.println(ones + "" + tens);
     
    }

/*
 * determines how long until a train leaves based on the current time and the time of train arrival
 * @ param - int curHour - the current hour
 * @ param - int curMin - the current minute
 * @ param - depHour - the hour the train departs
 * @ param - depMin - the minute the train departs
 * @ return void
 */
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int a = depHour*60 + depMin - curHour*60 - curMin;
        int b = a/60;
        int c = a%60;
        System.out.println(b + " hours and " + c + " minutes");
    }
}
