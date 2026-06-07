import java.util.*;
class Fibonacci 
{
    public static void main(String args[])
     {
        Scanner sh = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n , i,first,second;
        n = sh.nextInt();
        first = 0 ; second = 1;

        System.out.println("Fibonacci Series:");

        for ( i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
             first = second;
            second = next;
        }
    }
}