public class MathOps{
    public static void main (String[] args) {
        int x = 5;
        int y = 8;
        double m = 6.25;
        System.out.println("x = " + x + " y = " + y + " m = " + m);
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println((double)x/y);
        System.out.println("x+y is " + (x + y));
        System.out.println("x*m is " + x*m);
        System.out.println((x+y)/2.0);
        System.out.println("Remainders modulus operator");
        System.out.println(8%5);
        System.out.println("___");
        System.out.println(5/8);
        System.out.println(5%8);
        // PEMDAS - %operator has same precidnce as MD
        double a = 7+3%5/2.0 +6%(5-2);
        System.out.println(a);
        int b = 6*5%12;
        System.out.println(b);
        System.out.println(1+2+3 + " Hello");
        System.out.println("Hello " + 1+2+3);

        // increment operations
        int c = 6;
        int d = 8;
        c = c + 2;
        d = d - 3;
        System.out.println(c + " " + d);
        c += 2; // c = c + 2;
        d -= 3; // d = d - 2;
        System.out.println(c + " " + d); 
        c++;
        d--;
        System.out.println(c + " " + d);
    }
}
