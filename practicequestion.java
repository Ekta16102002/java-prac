import java.util.*;

public class practicequestion {
  public static void main(String[] arg) {

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter your name= ");
    // String name = sc.nextLine();

    // System.out.println("Hello");
    // System.out.println(name);

    // System.out.println("enter 1st number= ");
    // int x = sc.nextInt();
    // // System.out.println("enter 2st number= ");
    // // int y = sc.nextInt();

    // // int sum = x + y;
    // // System.out.println("sum of " + x + " and " + y + " = " + sum);
    // for (int i = 1; i <= 10; i++) {
    // int multi = x * i;
    // System.out.println(x + " x " + i + " = " + multi);
    // }
    // System.out.println("\nJava Version: " + System.getProperty("java.version"));
    // System.out.println("Java Runtime Version: " +
    // System.getProperty("java.runtime.version"));
    // System.out.println("Java Home: " + System.getProperty("java.home"));
    // System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
    // System.out.println("Java Vendor URL: " +
    // System.getProperty("java.vendor.url"));
    // System.out.println("Java Class Path: " +
    // System.getProperty("java.class.path") + "\n");

    // System.out.println("enter 1st no= ");
    // int x = sc.nextInt();
    // // int a = Integer.parseInt(x, 2);
    // System.out.println("enter 2nd no= ");
    // String y = sc.nextLine();
    // int b = Integer.parseInt(y, 2);

    // int sum = a + b;
    // String ans = Integer.toBinaryString(sum);
    // System.out.println("sum of " + x + " and " + y + " is " + ans);
    Scanner input = new Scanner(System.in);
    System.out.print("Input an integer: ");
    long n = input.nextLong();
    System.out.println("The sum of the digits is: " + sumDigits(n));

  }

  public static int sumDigits(long n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;

  }

}
