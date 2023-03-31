import java.util.Scanner;

public class functions {

  public static int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st no.= ");
    int a = sc.nextInt();
    System.out.println("enter 2nd no.= ");
    int b = sc.nextInt();

    int sum = calculateSum(a, b);
    System.out.println("sum od the 2 no.s = " + sum);

    sc.close();
  }
}
