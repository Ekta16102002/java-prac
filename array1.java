import java.util.Scanner;

public class array1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size= ");
    int size = sc.nextInt();
    int number[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.println("enter no. in array= ");
      number[i] = sc.nextInt();
    }
    for (int i = 0; i < number.length; i++) {
      System.out.print(number[i] + " ");
    }
    sc.close();
  }

}
