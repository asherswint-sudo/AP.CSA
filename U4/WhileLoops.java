package U4;

public class WhileLoops {
    public static int addOdds(int n){
        int x = 0;
        int result = 0;
        while(x < n){ 
            if (x % 2 != 0) result += x;
            x += 1; 
        }
    if (n % 2 == 0) return result;
    return result + n;
    }

    public static int sumDigits(int a){
        int mod = 10;
        int div = 1;
        int b = 0;
        while (div <= a){
            b += (a % mod) / div;
            mod *= 10;
            div *= 10;
        }
        return b;
    }
    
    public static int howManyYears(double startpop, double endpop){
        int years = 0;
        while(startpop < endpop){
             startpop *= 1.0113;
             years ++;
        }
        return years;
    }

    public static void printSum(int n){
        int total = 0;
        int test = 1;
        String printout = "";
        System.out.println("n = " + n + ":");  
        while (test<=n){
            total += test;
            printout += (test + " ");
            test++;
            if (test <= n){
                printout += ("+ ");
            }
        }
        System.out.println(printout + "= " + total);
    }
    
    public static boolean isPerfectSquare(int n){
        int a = 1;
        int b = 0;
        while (b < n){
            b += a;
            a += 2;
        }
        return b == n;
    }
    public static void main(String[] args) {
        System.out.println("addOdds");
        System.out.println(addOdds(5));
        System.out.println(addOdds(20));
        System.out.println(addOdds(11));

        System.out.println("");

        System.out.println("sumDigits");
        System.out.println(sumDigits(13));
        System.out.println(sumDigits(982473));
        System.out.println(sumDigits(4805));

        System.out.println("");

        System.out.println("howManyYears");
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));

        System.out.println("");
       
        System.out.println("printSum");
        printSum(6);
        printSum(25);
        printSum(3);

        System.out.println("");

        System.out.println("isPerfectSquare");
        System.out.println(isPerfectSquare(100));
        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(33));
        System.out.println(isPerfectSquare(444));

    }

}
// Output
// addOdds
// 9
// 100
// 36

// sumDigits
// 4
// 33
// 17

// howManyYears
// 7
// 27

// printSum
// n = 6:
// 1 + 2 + 3 + 4 + 5 + 6 = 21
// n = 25:
// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 + 21 + 22 + 23 + 24 + 25 = 325
// n = 3:
// 1 + 2 + 3 = 6

// isPerfectSquare
// true
// true
// false
// false