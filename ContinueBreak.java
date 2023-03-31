public class ContinueBreak
{
    public static void main(String[] args) 
    {
        for (int i=1;i<=40;i++)
        {
            if (i==15)
            {
                continue;
            }
            if (i==35)
            {
                break;
            }
            System.out.println("value is "+i);
        }
    }
}
