
public class emailb {
  public static void main(String[] args) {
    StringBuilder jim = new StringBuilder("ektasingh16102002@gamil.com");
    System.out.println(jim);

    jim.delete(jim.length() - 10, jim.length());
    System.out.println(jim);
  }
}
