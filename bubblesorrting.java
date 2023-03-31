import java.util.Scanner;

public class bubblesorrting {

  public static void bubble(int name[]) {
    for (int i = 0; i < name.length; i++) {
      System.out.print(name[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size");
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

    for (int i = 0; i < name.length - 1; i++) {
      for (int j = 0; j < name.length - 1 - i; j++) {
        if (name[j] > name[j + 1]) {
          int x = name[j];
          name[j] = name[j + 1];
          name[j + 1] = x;

        }
      }
    }
    bubble(name);
    sc.close();
  }
}
