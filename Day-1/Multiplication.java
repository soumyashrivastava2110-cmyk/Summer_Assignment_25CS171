import java.util.*;
class Multiplication
{
    public static void main(String args[]) 
    {
        Scanner sh= new Scanner(System.in);
        int i,n;
        System.out.println("enter a no.");
        n=sh.nextInt();
        for(i=1;i<=10;i++)
        {
        System.out.println(n + "*" + i + "="+ (n*i));
        }
    }
}


