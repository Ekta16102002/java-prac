
import java.util.Scanner;

public class bitwise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the postion= ");
    int pos = sc.nextInt();
    System.out.println("enter the number= ");
    int n = sc.nextInt();
    System.out.println("change to?= ");
    int x = sc.nextInt();
    int bitMask = 1 << pos;

    // get bit//
    // if ((bitMask & n) == 0) {
    // System.out.println("the bit was 0");
    // } else {
    // System.out.println("the bit was 1");
    // }
    //

    // set bit//
    // int newnum = bitMask | n;
    // System.out.println("the new number= " + newnum);
    //

    // clear bit//
    // int x = ~(bitMask);
    // int newnum = x & n;
    // System.out.println("the new number = " + newnum);
    //

    // update bit//
    if (x == 1) {
      int y = bitMask | n;
      System.out.println("the new num = " + y);
    } else if (x == 0) {
      int not = ~(bitMask);
      int newnum = not & n;
      System.out.println("the new number = " + newnum);
    } else {
      System.out.println("Invalid input!");
    }
    sc.close();
  }

}
