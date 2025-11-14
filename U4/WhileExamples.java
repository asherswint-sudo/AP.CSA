package U4;
public class WhileExamples{
    public static void fibonacci(int max) {
        int first = 0;
        int second = 1;
        int counter = first;
        System.out.print(first + " ");
        System.out.print(second + " ");
        while (counter < max){
            counter = first + second;
            System.out.println(counter + " ");
            first = second;
            second = counter;

        }
    }

    public static void main(String[] args) {
        

        int x = 10;
        while(x < 10000){
            fibbonacci(x);
            x=x*10;
        }
    }
}