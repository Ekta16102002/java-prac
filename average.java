import java.util.Scanner;

public class average {

  public static int averagecalculate(int a, int b, int c) {
    int avg = (a + b + c) / 3;
    return avg;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st no= ");
    int a = sc.nextInt();
    System.out.println("enter 2nd no= ");
    int b = sc.nextInt();
    System.out.println("enter 3rd no= ");
    int c = sc.nextInt();

    int avg = averagecalculate(a, b, c);
    System.out.println("Average of nos = " + avg);
    sc.close();
  }

}
