import java.util.Scanner;

public class addstring {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("enter 1st string= ");
    // String one = sc.nextLine();
    // System.out.println("enter 2nd string= ");
    // String two = sc.nextLine();

    // System.out.println(one + two);
    // System.out.println((one + two).length());

    System.out.println("enter no. of strings= ");
    int size = sc.nextInt();

    String jim[] = new String[size];
    int length = 0;
    for (int i = 0; i < size; i++) {
      jim[i] = sc.next();
      length = length + jim[i].length();
    }

    System.out.println("total length of string= " + length);

    // int size = sc.nextInt();
    // String array[] = new String[size];
    // int totLength = 0;
    // for (int i = 0; i < size; i++) {
    // array[i] = sc.next();
    // totLength += array[i].length();
    // }
    // System.out.println(totLength);

    sc.close();
  }
}
