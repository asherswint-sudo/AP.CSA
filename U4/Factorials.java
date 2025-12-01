package U4;

public class Factorials {
    public static long calcFactorial(int a){
        long b = 1;
        for(int k = 0; k < a; a --){
            b *= a;
        }
        return b;    
    }

    public static double calcE(){
        double e = 1;
        double e2 = 1;
        int a = 1;
        int x = 1;
        while(x == 1){
            e += 1.0/calcFactorial(a);
            if(e - e2 < 0.001) return e;
            e2 += 1.0/calcFactorial(a);
            a++;
        }
        return e;
    }
    
    public static double calcEX(int b){
        double e = 1;
        double e2 = 1;
        int a = 1;
        int x = 1;
        while(x == 1){
            e += Math.pow(b, a)/calcFactorial(a);
            if(e - e2 < 0.001) return e;
            e2 += Math.pow(b, a)/calcFactorial(a);
            a++;
        }
        return e;
    }

    public static void main(String[] args) {
        for(int k = 1; k <= 20; k++){
            System.out.println(k + "! = " + calcFactorial(k));
        }
        System.out.printf("e is %2.3f \n", calcE());
        for(int k = 1; k <= 5; k++){
            System.out.printf("e^" + k + " is %2.3f \n", calcEX(k));
        }
    }
}


// Output
// 1! = 1
// 2! = 2
// 3! = 6
// 4! = 24
// 5! = 120
// 6! = 720
// 7! = 5040
// 8! = 40320
// 9! = 362880
// 10! = 3628800
// 11! = 39916800
// 12! = 479001600
// 13! = 6227020800
// 14! = 87178291200
// 15! = 1307674368000
// 16! = 20922789888000
// 17! = 355687428096000
// 18! = 6402373705728000
// 19! = 121645100408832000
// 20! = 2432902008176640000
// e is 2.718 
// e^1 is 2.718
// e^2 is 7.389
// e^3 is 20.085
// e^4 is 54.598
// e^5 is 148.413