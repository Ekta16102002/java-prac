import java.util.Scanner;

public class factrec {

  public static void fact(int i, int facto) {
    if (i == 1 || i == 0) {
      System.out.println(facto);
      return;
    }
    facto = facto * i;
    fact(i - 1, facto);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enetr no.= ");
    int i = sc.nextInt();

    fact(i, 1);
    sc.close();
  }
}
