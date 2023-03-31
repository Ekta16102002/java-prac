import java.util.Scanner;

public class fact {

  public static void factorial(int a) {
    if (a < 0) {
      System.out.println("invalid");
      return;
    }
    int fact = 1;
    for (int i = a; i >= 1; i--) {
      fact = fact * i;

    }
    System.out.println(fact);
    return;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st no= ");
    int a = sc.nextInt();

    factorial(a);
    sc.close();
  }

}
