import java.util.Scanner;

public class ex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // System.out.println("Enter column= ");
    // int a = sc.nextInt();

    // for (int i = 1; i <= a; i++) {
    // for (int j = 1; j <= a - i; j++) {

    // System.out.print(" ");
    // }
    // for (int j = 1; j <= a; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }

    // for (int i = 0; i < 20; i++) {
    // System.out.println(i);
    // // System.out.println("I Love you Jimin");
    // }

    // int i = 1;
    // while (i <= 10) {
    // System.out.println(i);
    // i++;
    // }

    // int i = 1;
    // do {
    // System.out.println(i);
    // i++;
    // } while (i <= 10);

    System.out.println("enter the natural no. = ");
    int n = sc.nextInt();
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // sum = sum + i;
    // }
    // System.out.println(sum);

    for (int i = 1; i <= 10; i++) {

      System.out.println(n + "x" + i + "=" + n * i);
    }
    sc.close();
  }
}
