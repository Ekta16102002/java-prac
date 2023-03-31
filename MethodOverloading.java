class sum
{
    public void add(int i,int j)
    {
        System.out.println(i+j);
    }
    public void add(int i,int j,int k)
    {
        System.out.println(i+j+k);
    }
    public void add(double i,double j)
    {
        System.out.println(i+j);
    }
}
public class MethodOverloading 
{
 public static void main(String[] args) 
 {
     sum obj=new sum();
     obj.add(7, 11);
     obj.add(18, 17, 3);
     obj.add(11.7856, 45.6756);
 }
}
