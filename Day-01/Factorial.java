import java.util.*;
class Factorial
{
    public static void main(String args[]) 
    {
        Scanner sh= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i, n;
        n = sh.nextInt();
        long factor = 1;
        for (i = 1; i <= n; i++) 
            {
            factor =factor * i;
        }

        System.out.println("Factorial of " + n + " = " + factor);
    }
}