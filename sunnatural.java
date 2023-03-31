import java.util.Scanner;

public class sunnatural {
  public static void printSum(int i, int n, int sum) {
    if (i == n) {
      System.out.println(sum);
      return;
    }
    sum += n;
    printSum(i + 1, n, sum);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enetr no.= ");
    int n = sc.nextInt();
    printSum(1, n, 0);
    sc.close();
  }

}
