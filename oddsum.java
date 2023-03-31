import java.util.Scanner;

public class oddsum {

  public static int sumOfOdd(int a) {
    int sum = 0;
    for (int i = 1; i <= a; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }
    System.out.println("sum of odd nos = " + sum);

    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n= ");
    int a = sc.nextInt();

    sumOfOdd(a);

    sc.close();
  }

}
