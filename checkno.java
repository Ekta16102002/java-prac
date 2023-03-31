import java.util.Scanner;

public class checkno {
  public static void main(String[] args) {
    int p = 0;
    int n = 0;
    int z = 0;
    System.out.println("press 1 to continue and 0 to stop.");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1 or 0= ");
    int input = sc.nextInt();

    while (input == 1) {
      System.out.println("enter no.= ");
      int number = sc.nextInt();
      if (number > 0) {
        p++;
      } else if (number < 0) {
        n++;
      } else {
        z++;
      }
      System.out.println("press 1 to continue and 0 to stop.");
      input = sc.nextInt();
    }
    System.out.println("positives= " + p);
    System.out.println("negatives= " + n);
    System.out.println("zeros= " + z);
    sc.close();
  }
}