import java.util.Scanner;

public class evenodd {

  public static int checkevenodd(int a) {
    if (a % 2 == 0) {
      System.out.println("its an even no.");
    } else {
      System.out.println("its an odd no.");
    }
    return a;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no.= ");
    int a = sc.nextInt();

    checkevenodd(a);
    sc.close();
  }

}
