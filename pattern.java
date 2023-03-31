import java.util.Scanner;

public class pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter no. of cloumns= ");
    int a = sc.nextInt();
    System.out.println("enter no. of rows= ");
    int b = sc.nextInt();

    // solid rectangle
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= b; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // // hollow rectangle
    // for (int i = 1; i <= a; i++) {
    // for (int j = 1; j <= b; j++) {
    // if (i == 1 || j == 1 || i == b || j == a) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }

    // // half pyramid
    // for (int i = 1; i <= a; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // // half inverted pyramid
    // for (int i = a; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // // half pyramid swaped to right
    // for (int i = 1; i <= a; i++) {
    // for (int j = 1; j <= a - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // // number half pyramid
    // for (int i = 1; i <= a; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }

    // // inverted no. pyramid
    // for (int i = a; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // for (int i = 1; i <= a; i++) {
    // for (int j = 1; j <= a - i + 1; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }

    // // floyd's triangle
    // int n = 1;
    // for (int i = 1; i <= a; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(n + " ");
    // n++;
    // }
    // System.out.println();
    // }

    // // 0-1 triangle
    // for (int i = 1; i <= a; i++) {
    // for (int j = 1; j <= i; j++) {
    // int n = i + j;
    // if (n % 2 == 0) {
    // System.out.print("1 ");
    // } else {
    // System.out.print("0 ");
    // }
    // }
    // System.out.println();

    // }

    sc.close();
  }
}
