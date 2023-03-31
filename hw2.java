import java.util.Scanner;

public class hw2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1 or 0=");
    int i = sc.nextInt();

    do {
      System.out.println("enter marks=");
      int marks = sc.nextInt();
      if (marks >= 90) {
        System.out.println("This is Good");
      } else if (89 >= marks && marks >= 60) {
        System.out.println("This is also Good");
      } else if (59 >= marks && marks >= 0) {
        System.out.println("This is Good as well");
      } else {
        System.out.println("Invalid marks");
      }
      System.out.println("want to contine?? ");
      i = sc.nextInt();
    } while (i == 1);
    sc.close();
  }
}
