import java.util.Scanner;
class Nersted2
{
public static void main (String args[]){
int i,j;
int letter=64;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number of rows");
int rows=scan.nextInt();
for(i=1; i<=rows; i++){
  for(j=1; j<=i; j++){
  System.out.print((char)(j+letter));


}
System.out.println();

}

}

}