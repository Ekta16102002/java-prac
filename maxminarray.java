import java.util.Scanner;

public class maxminarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size= ");
    int size = sc.nextInt();
    int maxmin[] = new int[size];

    for (int i = 0; i < size; i++) {
      maxmin[i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < size; i++) {
      if (maxmin[i] < min) {
        min = maxmin[i];
      }
      if (maxmin[i] > max) {
        max = maxmin[i];
      }

    }
    System.out.println("minimum value = " + min);
    System.out.println("maximum value = " + max);

    sc.close();
  }

}
