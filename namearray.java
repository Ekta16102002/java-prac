import java.util.*;

public class namearray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size= ");
    int size = sc.nextInt();
    String name[] = new String[size];

    for (int i = 0; i < size; i++) {
      name[i] = sc.next();
    }

    for (int i = 0; i < size; i++) {
      System.out.println("name " + (i + 1) + " is: " + name[i]);

    }

    sc.close();
  }
}
