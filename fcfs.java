import java.util.*;

class FCFS {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("Enter the number of processes");
    System.out.println(" ");
    int p = sc.nextInt();
    int i;
    int b[] = new int[p + 1];
    System.out.println(" ");
    System.out.println("Enter the burst time for each process");
    System.out.println(" ");
    for (i = 1; i < p + 1; i++) {
      System.out.print("P" + i + " =" + " ");
      b[i] = sc.nextInt();
      System.out.println(" ");
    }
    int w[] = new int[p + 1];
    w[1] = 0;
    for (i = 2; i < p + 1; i++) {
      w[i] = b[i] + b[i - 1];
    }
    int ta[] = new int[p + 1];
    for (i = 1; i < p + 1; i++) {
      ta[i] = b[i] + ta[i - 1];
    }
    double w1 = 0;
    double t1 = 0;
    for (i = 1; i < p + 1; i++) {
      w1 = w1 + w[i];
      t1 = t1 + ta[i];
    }
    w1 = w1 / p;
    t1 = t1 / p;
    System.out.println("------------------------------------------------------");
    System.out.println("|Process|CPU Burst time|Waiting Time|Turn around Time|");
    for (i = 1; i < p + 1; i++) {
      System.out.println("------------------------------------------------------");
      System.out
          .println("|  P" + i + "   |      " + b[i] + "       |     " + w[i] + "     |       " + ta[i] + "       |");
    }
    System.out.println("------------------------------------------------------");
    System.out.println(" ");
    System.out.println("Average Waiting Time     : " + w1);
    System.out.println("Average Turn Around Time : " + t1);
    System.out.println(" ");
    System.out.println("Gantt Chart :");
    System.out.println(" ");
    for (i = 1; i < p + 1; i++) {
      System.out.print("---------");
    }
    System.out.println();
    for (i = 1; i < p + 1; i++) {
      System.out.print("|   " + "p" + i + "   ");
    }
    System.out.println("|");
    for (i = 1; i < p + 1; i++) {
      System.out.print("---------");
    }
    System.out.println(" ");
    System.out.print(0 + "       ");
    for (i = 1; i < p + 1; i++) {
      System.out.print(ta[i] + "       ");
    }
  }
}
