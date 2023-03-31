//import java.util.Scanner;

public class recurssion {

  // public static void num(int n) {
  // if (n == 0) {
  // return;
  // }
  // System.out.println(n);
  // num(n - 1);

  // }
  public static void num(int n) {
    if (n == 6) {
      return;
    }
    System.out.println(n);
    num(n + 1);

  }

  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the no= ");
    // int n = sc.nextInt();
    int n = 1;
    num(n);
    // sc.close();
  }
}
