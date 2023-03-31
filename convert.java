import java.util.Scanner;

public class convert {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("what u want to do??");
    System.out.println("1.decimal to binary");
    System.out.println("2.binary to decimal");
    System.out.println("3.decimal to octal");
    System.out.println("4.octal to decimal");
    System.out.println("5.decimal to hexa");
    System.out.println("6.hexa to decimal");
    int n = sc.nextInt();

    if (n == 1) {
      System.out.println("enter the no.= ");
      int x = sc.nextInt();
      String bin = Integer.toBinaryString(x);
      System.out.println("the binary representation of " + x + " is " + bin);
    } else if (n == 2) {
      System.out.println("enter the no.= ");
      String y = sc.next();
      int dec = Integer.parseInt(y, 2);
      System.out.println("the decimal representation of " + y + " is " + dec);
    } else if (n == 3) {
      System.out.println("enter the no.= ");
      int x = sc.nextInt();
      String oct = Integer.toOctalString(x);
      System.out.println("the octal representation of " + x + " is " + oct);
    } else if (n == 4) {
      System.out.println("enter the no.= ");
      String y = sc.next();
      int dec = Integer.parseInt(y, 8);
      System.out.println("the decimal representation of " + y + " is " + dec);
    } else if (n == 5) {
      System.out.println("enter the no.= ");
      int x = sc.nextInt();
      String hex = Integer.toHexString(x);
      System.out.println("the hexa representation of " + x + " is " + hex);
    } else if (n == 6) {
      System.out.println("enter the no.= ");
      String y = sc.next();
      int dec = Integer.parseInt(y, 16);
      System.out.println("the decimal representation of " + y + " is " + dec);
    } else {
      System.out.println("Invalid input");
    }

    sc.close();
  }

}
