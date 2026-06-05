import java.util.*;
 class Prime
  {
    public static void main(String args[]) 
    {
        Scanner sh = new Scanner(System.in);
        int n,i;
        System.out.print("Enter a number: ");
         n = sh.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for ( i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}