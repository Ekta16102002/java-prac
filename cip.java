import java.util.Scanner;

public class cip {
  public static StringBuffer encrypt(String string, int x) {
    StringBuffer result = new StringBuffer();

    for (int i = 0; i < string.length(); i++) {
      if (Character.isUpperCase(string.charAt(i))) {
        char ch = (char) (((int) string.charAt(i) +
            x - 65) % 26 + 65);
        result.append(ch);
      } else {
        char ch = (char) (((int) string.charAt(i) +
            x - 97) % 26 + 97);
        result.append(ch);
      }
    }
    return result;
  }

  public static StringBuffer decrypt(StringBuffer y, int x) {

    StringBuffer rest = new StringBuffer();

    for (int i = 0; i < y.length(); i++) {
      if (Character.isUpperCase(string.charAt(i))) {
        char ch = (char) (((int) string.charAt(i) -
            x - 65) % 26 + 65);
        rest.append(ch);
      } else {
        char ch = (char) (((int) string.charAt(i) -
            x - 97) % 26 + 97);
        rest.append(ch);
      }
    }
    return rest;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter ur message= ");
    String string = sc.next();
    System.out.println("enter shift key= ");
    int x = sc.nextInt();
    System.out.println("Plain text is= " + string);
    System.out.println("encrypted text is= " + encrypt(string, x));
    StringBuffer y = encrypt(string, x);
    System.out.println("decrypted text is= " + decrypt(y, x));
    sc.close();
  }
}
