import java.util.*;
class Sum
{
    public static void main(String args[]) 
    {
        Scanner sh= new Scanner(System.in);
        int i,sum=0,n;
        System.out.println("enter a no.");
        n=sh.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of natural no ="+ sum);
    }
}