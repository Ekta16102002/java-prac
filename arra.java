import java.util.Scanner;

public class arra {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size= ");
    int size = sc.nextInt();
    int name[] = new int[size];

    for (int i = 0; i < size; i++) {
      // System.out.print("enter array= ");
      name[i] = sc.nextInt();
    }
    System.out.println("array is= ");
    for (int i = 0; i < size; i++) {
      System.out.print(name[i] + " ");
    }
    sc.close();
  }

}
