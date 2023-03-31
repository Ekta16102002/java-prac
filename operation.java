import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number= ");
        int m = sc.nextInt();
        System.out.println("enter the second number= ");
        int n = sc.nextInt();
        int r1 = m + n;
        int r2 = m - n;
        int r3 = m * n;
        double r4 = (double) m / n;
        int r5 = m % n;

        System.out.print("added value is ");
        System.out.println(r1);
        System.out.print("subtracted value is ");
        System.out.println(r2);
        System.out.print("multiplied value is ");
        System.out.println(r3);
        System.out.print("divided value is ");
        System.out.println(r4);
        System.out.print("remainder is ");
        System.out.println(r5);
        sc.close();
    }
}
