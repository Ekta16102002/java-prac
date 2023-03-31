import java.util.Scanner;

public class fibborec {
  public static void fib(int a, int b, int n) {
    if (n == 0) {
      return;
    }
    System.out.println(a);
    fib(b, a + b, n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the nth term= ");
    int n = sc.nextInt();
    fib(0, 1, n);
    sc.close();
  }

}
