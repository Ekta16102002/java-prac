import java.util.Scanner;
//linear search 

public class searcharray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size= ");
    int size = sc.nextInt();
    int number[] = new int[size];

    for (int i = 0; i < number.length; i++) {
      System.out.println("enter no. in array= ");
      number[i] = sc.nextInt();
    }

    System.out.println("enter no. to search= ");
    int n = sc.nextInt();

    for (int i = 0; i < number.length; i++) {
      if (number[i] == n) {
        System.out.println("the noo. is found at = " + i);
      }

    }

    sc.close();
  }
}
