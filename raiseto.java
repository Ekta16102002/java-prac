import java.util.Scanner;

public class raiseto {

  public static int raiseToPower(int x, int n) {
    int ans = 1;
    for (int i = 0; i < n; i++) {
      ans = ans * x;
    }
    System.out.println("answer =" + ans);

    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter base= ");
    int x = sc.nextInt();
    System.out.println("enter power= ");
    int n = sc.nextInt();

    raiseToPower(x, n);
    sc.close();
  }

}
