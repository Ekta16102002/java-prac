import java.util.Scanner;

public class fibbo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no= ");
    int n = sc.nextInt();
    int i = 0;
    int j = 1;
    int f = 0;
    System.out.println("fibbonacci series= ");
    System.out.println(i);
    System.out.println(j);
    for (int x = 2; x <= n; x++) {
      f = i + j;
      System.out.println(f);
      i = j;
      j = f;
    }

    sc.close();
  }

}
