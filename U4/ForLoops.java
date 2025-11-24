package U4;

public class ForLoops {
    public static int addEvens(int n){
        int x = 0;
        int sum = 0;
        for (x = 0; x <= n; x += 2){
            sum += x;
        }
        return sum;
    }

    public static void printSquaresBack(int n){
        for (int i = n; i >= 1; i--){
            System.out.print((int)Math.pow(i, 2) + " ");
        }
        System.out.println();
    }

    public static String reverse(String s){
        String a = "";
        for (int b = s.length() - 1; b >= 0; b--){
            a += s.charAt(b);
        }
        return a;
    }

    public static String stutter(String s){
        String a = "";
        for(int x = 0; x <= s.length() - 1; x ++){
            a += s.charAt(x);
            a += s.charAt(x);
        }
        return a;
    }

    public static void sillyNumbers(){
        int z = 0;
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 3; y++){
                System.out.print(z);
            }
            z++;
        }
    }

    public static void sillyNumbers2(){
        int z = 9;
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < z; y++){
                System.out.print(z);
            }
            z--;
        }
    }


    public static void main(String[] args) {
        System.out.println("addEvens");
        System.out.println(addEvens(4));
        System.out.println(addEvens(6));
        System.out.println(addEvens(44));
        System.out.println("");
        System.out.println("printSquaresBack");
        printSquaresBack(5);
        printSquaresBack(2);
        printSquaresBack(15);
        System.out.println("");
        System.out.println("reverse");
        System.out.println(reverse("Pikachu"));
        System.out.println(reverse("Krish"));
        System.out.println(reverse("Cabinet"));
        System.out.println("");
        System.out.println("stutter");
        System.out.println(stutter("hello"));
        System.out.println(stutter("pushup"));
        System.out.println(stutter("loop"));
        System.out.println("");
        System.out.println("sillynumbers");
        sillyNumbers();
        System.out.println("");
        System.out.println("");
        System.out.println("sillynumbers2");
        sillyNumbers2();
    }
}