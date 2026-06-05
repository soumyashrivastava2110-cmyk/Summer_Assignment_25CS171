import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sh = new Scanner(System.in);
        int n,r,o,d;
        System.out.print("Enter a number: ");
         n = sh.nextInt();
         o= n;
         r = 0;

        while ( n!= 0) {
            d = n % 10;
            r = r * 10 + d;
            n /= 10;
        }

        if (o==r) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

    }
}