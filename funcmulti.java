import java.util.Scanner;

public class funcmulti {

  public static int caluclateMultiplication(int a, int b) {
    return a * b;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st no= ");
    int a = sc.nextInt();
    System.out.println("enter 2nd no= ");
    int b = sc.nextInt();

    System.out.println("multiplication = " + caluclateMultiplication(a, b));

    sc.close();
  }

}
