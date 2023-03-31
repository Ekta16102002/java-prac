import java.io.PrintStream;

public class replace {
  private static final PrintStream OUT = System.out;

  public static void main(String[] args) {
    StringBuilder jim = new StringBuilder("hello");
    OUT.println(jim);

    jim.setCharAt(1, 'i');
    System.out.println(jim);
  }

}
