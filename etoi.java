import java.util.Scanner;

public class etoi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String jim = sc.next();
    String ans = "";

    for (int i = 0; i < jim.length(); i++) {
      if (jim.charAt(i) == 'e') {
        ans = ans + 'i';
      } else {
        ans = ans + jim.charAt(i);
      }
    }
    System.out.println(ans);
    sc.close();
  }

}
