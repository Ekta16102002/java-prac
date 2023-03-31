import java.util.Scanner;

public class agecheck {

  public static int checkAgeForVote(int a) {
    if (a < 18) {
      System.out.println("You are not eligible for voting");
    } else {
      System.out.println("You are eligible for voting");
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age= ");
    int a = sc.nextInt();

    checkAgeForVote(a);
    sc.close();
  }

}
