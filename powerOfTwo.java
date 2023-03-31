import java.util.Scanner;

public class powerOfTwo {
  // public static void main(String[] args) {
  // int pos = 0;
  // int bitWise = 1 << pos;
  // System.out.println("the enter no. is power of 2?");
  // if ((bitWise & n) == 0) {
  // System.out.println("yes");
  // } else {
  // System.out.println("no");
  // }

  static boolean isPowerofTwo(int n) {
    int cnt = 0;
    while (n > 0) {
      if ((n & 1) == 1) {
        cnt++; // if n&1 == 1 keep incrementing cnt
        // varibale
      }
      n = n >> 1; // keep dividing n by 2 using right
                  // shift operator
    }
    if (cnt == 1) {
      // if cnt = 1 only then it is power of 2
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    if (isPowerofTwo(x) == true)
      System.out.println("Yes");
    else
      System.out.println("No");

    // if (isPowerofTwo(128) == true)
    // System.out.println("Yes");
    // else
    // System.out.println("No");
    // }
    sc.close();
  }
}
