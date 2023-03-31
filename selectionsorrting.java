import java.util.Scanner;

public class selectionsorrting {
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
      int smallest = i;
      for (int j = i + 1; j < name.length; j++) {
        if (name[j] < name[smallest]) {
          smallest = j;
        }
      }
      // decendengi de dega
      // int temp = name[smallest];
      // name[smallest] = name[j];
      // name[j] = temp;

      int temp = name[smallest];
      name[smallest] = name[i];
      name[i] = temp;

    }
    bubble(name);
    sc.close();
  }

}
