import java.util.Scanner;

public class $$ {

    public static void main(String[] args) {

        String pattern;
        int a;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the pattern to print : ");
        pattern = scan.nextLine();

        System.out.print("Enter number of times it should get printed : ");
        a = scan.nextInt();

        for (int i = 1; i <= a; i++) {

            System.out.println();

            if (i == 1 || i == a) {

                for (int j = 1; j <= a; j++) {

                    System.out.print(pattern + " ");

                }
            } else {

                for (int k = 1; k <= a; k++) {

                    if (k == 1 || k == a) {

                        System.out.print(pattern + " ");

                    } else {

                        System.out.print("  ");

                    }
                }
            }
        }
        scan.close();
    }
}