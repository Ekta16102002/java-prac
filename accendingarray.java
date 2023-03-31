import java.util.Scanner;

public class accendingarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size= ");
    int size = sc.nextInt();
    int assend[] = new int[size];

    for (int i = 0; i < size; i++) {
      assend[i] = sc.nextInt();
    }

    boolean isassend = true;

    for (int i = 0; i < size - 1; i++) {

      if (assend[i] > assend[i + 1]) {
        isassend = false;
      }
    }

    if (isassend) {
      System.out.println("the array is in accending order");
    } else {
      System.out.println("the array is not in accending order");
    }
    sc.close();
  }

}
