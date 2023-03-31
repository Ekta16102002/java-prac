import java.util.Scanner;

public class onescomp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("eneter the number= ");
    int n = sc.nextInt();

    int x = ~(n);
    String finalno = Integer.toBinaryString(x);
    System.out.println("the 1's compliment of " + n + " is " + finalno);
    sc.close();
  }

}
