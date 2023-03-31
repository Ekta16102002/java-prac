import java.util.Scanner;

public class gcd {

  public static int gcdCalculate(int n1, int n2) {
    int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        gcd = i;
      }

    }
    System.out.println("Greatest Common Divisor(GCD)= " + gcd);
    return gcd;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st no= ");
    int n1 = sc.nextInt();
    System.out.println("enter 2nd no= ");
    int n2 = sc.nextInt();

    gcdCalculate(n1, n2);

    sc.close();
  }

}
