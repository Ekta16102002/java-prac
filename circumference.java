import java.util.Scanner;

public class circumference {

  public static double circumOfCircle(double r) {
    double PI = 3.1415;
    double circum = 2 * PI * r;
    System.out.println("circumference of circle= " + circum);
    return circum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter radius of circle or r= ");
    double r = sc.nextDouble();

    circumOfCircle(r);
    sc.close();
  }

}
