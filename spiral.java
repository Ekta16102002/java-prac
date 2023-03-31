import java.util.Scanner;

public class spiral {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter row= ");
    int n = sc.nextInt();
    System.out.println("enter column= ");
    int m = sc.nextInt();
    int number[][] = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print("enter the element= ");
        number[i][j] = sc.nextInt();
      }
    }
    System.out.println("Spiral order is given by: ");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {

        System.out.print(number[i][j] + " ");
      }
    }

    sc.close();
  }

}
