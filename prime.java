import java.util.Scanner;

public class prime {

  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("enter 1st no= ");
    int a = x.nextInt();
    int i, m = 0, flag = 0;
    m = a / 2;
    if (a == 0 || a == 1) {
      System.out.println(a + " is not a prime no.");
    } else {
      for (i = 2; i <= m; i++) {
        if (a % i == 0) {
          System.out.println(a + " is not a prime no.");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(a + " is a prime no.");

      }

    }
    x.close();
  }
}