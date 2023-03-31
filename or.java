import java.util.Scanner;

public class or {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1 or 0=");
    int i = sc.nextInt();
    if (i == 1) {
      System.out.println("enter marks= ");
      int m = sc.nextInt();
      if (m >= 90) {
        System.out.println("This is Good");
      } else if (89 >= m && m >= 60) {
        System.out.println("This is also Good");
      } else if (59 >= m && m >= 0) {
        System.out.println("This is Good as well");
      } else {
        System.out.println("Invalid marks");
      }

    } else {
      System.out.println("okay no problem");
    }

    sc.close();
  }
}