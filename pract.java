import java.util.Scanner;

public class pract {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 1 to n natural no.
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // System.out.println(i);
    // }

    // even no till n
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 0; i <= n / 2; i++) {
    // System.out.println(i * 2);
    // }

    // odd no till n
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n / 2; i++) {
    // System.out.println((i * 2) - 1);
    // }

    // sum of even till n
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int sum = 0;
    // for (int i = 0; i <= n / 2; i++) {
    // sum = sum + (i * 2);
    // }
    // System.out.println(sum);

    // sum of odd till n
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // double sum = 0;
    // for (double i = 0; i < n / 2; i++) {
    // sum = sum + ((i * 2) + 1);
    // }
    // System.out.println(sum);

    // table
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // System.out.println("enter till= ");
    // int t = sc.nextInt();
    // for (int i = 0; i <= t; i++) {
    // System.out.println(n + "x" + i + "=" + n * i);
    // }

    // no of digits
    // System.out.println("enter nummber= ");
    // int n = sc.nextInt();
    // int digit = 0;
    // int digits = 0;
    // int sum = 0;
    // while (n > 0) {
    // n = n / 10;
    // digit = digit + 1;

    // digits = n % 10;

    // sum = sum + digits;
    // n=n/10;
    // }
    // System.out.println(digit);
    // System.out.println(sum);

    // rreverse order natural no
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = n; i > 0; i--) {
    // System.out.println(i);
    // }

    // no. is prime or not
    // System.out.println("enter no.= ");
    // int n = sc.nextInt();
    // int flag = 0;
    // if (n == 0 || n == 1) {
    // System.out.println(n + " is not prime number");
    // } else {
    // for (int i = 2; i <= n / 2; i++) {
    // if (n % i == 0) {
    // System.out.println(n + " is not prime number");
    // flag = 1;
    // break;
    // }

    // }
    // if(flag==0){
    // System.out.println(n + " is a prime number");
    // }
    // }

    // // prime no to n
    // System.out.println("enter n");
    // int n = sc.nextInt();
    // int counter;
    // int sum = 0;
    // for (int i = 2; i <= n; i++) {
    // counter = 0;
    // for (int j = 1; j <= i; j++) {
    // if (i % j == 0) {
    // counter++;
    // }
    // }
    // if (counter == 2) {
    // sum = sum + i;
    // System.out.println(i);

    // }

    // }
    // System.out.println("sum= " + sum);

    // armstrong no.
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int temp = n;
    // int p = 0;
    // while (n > 0) {

    // int rem = n % 10;
    // p = (p) + (rem * rem * rem);
    // n = n / 10;
    // }
    // if (temp == p) {
    // System.out.println("Yes. It is Armstrong No.");
    // } else {
    // System.out.println(
    // "No. It is not an Armstrong No.");
    // }

    // pattern
    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 65;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print((char) (alphabet + j - 1) + " ");
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i+" ");
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 65;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print((char) (alphabet + i - 1) + " ");
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int j = n; j > i; j--) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= i; k++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int j = n; j > i; j--) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= i; k++) {
    // System.out.print(k);
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j < i; j++) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= n; k++) {
    // System.out.print(k);
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j < i; j++) {
    // System.out.print(" ");
    // }
    // for (int k = i; k <= n; k++) {
    // System.out.print(k);
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 65;
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j < i; j++) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= i; k++) {
    // System.out.print((char) (alphabet + k - 1));
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 65;
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j < i; j++) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= n; k++) {
    // System.out.print((char) (alphabet + k - 1));
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 65;
    // for (int i = 1; i <= n; i++) {
    // for (int j = i; j > 1; j--) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= i; k++) {
    // System.out.print((char) (alphabet + k - 1));
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 65;
    // for (int i = 1; i <= n; i++) {
    // for (int j = n; j > i; j--) {
    // System.out.print(" ");
    // }
    // for (int k = 1; k <= i; k++) {
    // System.out.print((char) (alphabet + k - 1));
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 65;
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j < i; j++) {
    // System.out.print(" ");
    // }
    // for (int k = i; k <= n; k++) {
    // System.out.print((char) (alphabet + k - 1));
    // }
    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int k = n; k > i; k--) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * i - 1; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int k = n; k > i; k--) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= 2 * i - 1; j++) {
    // System.out.print(j);
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // for (int k = n; k > i; k--) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i);
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 64;
    // for (int i = 1; i <= n; i++) {
    // for (int k = n; k > i; k--) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print((char) (alphabet + i));
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = n; i >= 1; i--) {

    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = n; i >= 1; i--) {

    // for (int j = i; j >= 1; j--) {
    // System.out.print(j);
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {

    // for (int j = n; j >= i; j--) {
    // System.out.print(j);
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // for (int i = n; i >= 1; i--) {

    // for (int j = n; j >= i; j--) {
    // System.out.print(j);
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int a = 1;
    // for (int i = 1; i <= n; i++) {

    // for (int j = 1; j <= i; j++) {
    // System.out.print(a + " ");
    // a++;
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 64;
    // for (int i = n; i >= 1; i--) {

    // for (int j = 1; j <= i; j++) {
    // System.out.print((char) (alphabet + j) + " ");
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 64;
    // for (int i = 1; i <= n; i++) {

    // for (int j = n; j >= i; j--) {
    // System.out.print((char) (alphabet + j) + " ");
    // }

    // System.out.println();
    // }

    // System.out.println("enter n= ");
    // int n = sc.nextInt();
    // int alphabet = 64;
    // for (int i = n; i >= 1; i--) {

    // for (int j = n; j >= i; j--) {
    // System.out.print((char) (alphabet + j) + " ");
    // }

    // System.out.println();
    // }

    System.out.println("enter n= ");
    int n = sc.nextInt();
    int alphabet = 64;
    int a = 1;
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print((char) (alphabet + a) + " ");
        a++;
      }

      System.out.println();
    }

    sc.close();
  }
}
