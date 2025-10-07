import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    //screate a scanner class to read input from the user
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word.");
    String word1 = sc.nextLine();
    System.out.println(word1);
    System.out.println("Enter a word.");
    String word2 = sc.nextLine();
    System.out.println(word2);
    sc.close();

    // play with the words
    int len1 = word1.length();
    int len2 = word2.length();
    System.out.println(len1);
    System.out.println(len2);
    System.out.println(len1 + " " + len2);

    String f1 = word1.substring(0, len1 / 2);
    String f2 = word2.substring(0, len2 / 2);
    String end1 = word1.substring(len1 /2);
    String end2 = word2.substring(len2 / 2);

    System.out.println(f1 + " " + f2 + " " + end1 + " " + end2);
    String new1 = f1 + end2;
    String new2 = f2 + end1;
    System.out.println(new1);
    System.out.println(new2);

    // find and replace stuff
    int loc1 = word1.indexOf("oo");
    int loc2 = word1.indexOf("aa");
    System.out.println(loc1 + " " + loc2);
    String new3 = word1.replace("oo","aa");
    System.out.println(new3);
    String new4 = word1.replace("k","x");
    System.out.println(new4);
    System.out.println(new4.toUpperCase());
  }
}