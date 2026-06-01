package AfterTest;

public class CheckerTester {
    public static void main(String[] args) {
        String s1 = "The Rain in Spain stays mainly in the plain.";
        String s2 = "Singing in the Rain";

        DoubleWordChecker dwc1 = new DoubleWordChecker("Rain", "Spain");
        System.out.println("S1 Contains both Rain and Spain   " + dwc1.andChecker(s1));
        System.out.println("S2 Contains both Rain and Spain   " + dwc1.andChecker(s2));
        System.out.println("S1 Contains either Rain or Spain   " + dwc1.orChecker(s1));
        System.out.println("S2 Contains either Rain or Spain   " +dwc1.orChecker(s2));
        System.out.println(dwc1);

        ShortDoubleWordChecker sdwc1 = new ShortDoubleWordChecker("Rain", "Spain",50);
        ShortDoubleWordChecker sdwc2 = new ShortDoubleWordChecker("Rain", "Spain");
        System.out.println("S1 Contains both Rain and Spain (long)   " + sdwc1.andChecker(s1));
        System.out.println("S1 Contains both Rain and Spain (short)   " + sdwc2.andChecker(s1));
        System.out.println("S1 Contains either Rain or Spain but not both   " + sdwc1.xorChecker(s1));
        System.out.println("S2 Contains either Rain or Spain but not both   " +sdwc1.xorChecker(s2));

        // Output
        // S1 Contains both Rain and Spain   true
        // S2 Contains both Rain and Spain   false
        // S1 Contains either Rain or Spain   true
        // S2 Contains either Rain or Spain   true
        // Double Double words Rain Spain are fun.
        // S1 Contains both Rain and Spain (long)   true        
        // S1 Contains both Rain and Spain (short)   false      
        // S1 Contains either Rain or Spain but not both   false
        // S2 Contains either Rain or Spain but not both   true 

    }   
}
