import java.util.Scanner;

public class greater {

  public static void greaterOfTwo(int a, int b) {
    if (a > b) {
      System.out.println("a is greater than b or a>b");
    } else {
      System.out.println("b is greater than a or b>a");
    }
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no.= ");
    int a = sc.nextInt();
    System.out.println("enter b no.= ");
    int b = sc.nextInt();
    greaterOfTwo(a, b);

    sc.close();
  }

}
