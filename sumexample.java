import java.util.Scanner;

public class sumexample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n= ");
    int a = sc.nextInt();
    int sum = 0;
    // for loop
    for (int i = 1; i <= a; i++) {
      sum = sum + i;
    }
    System.out.println(sum);

    // while loop
    // int sum = 0;
    // while (sum < i + 1) {
    // System.out.println(sum);
    // sum = sum + 1;
    // }

    // do while
    sc.close();
  }

}
