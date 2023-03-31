import java.util.*;

public class oddeventry {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any no.= ");
    int a=sc.nextInt();
    if(a%2==0){
      System.out.println("its an even no.");
    }
    else{
      System.out.println("its an odd no.");
    }
    sc.close();
  }
  
}
