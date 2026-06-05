import java.util.*;
class Product
{
    public static void main(String args[]) 
    {
        Scanner sh = new Scanner(System.in);
        int n,p,d;
        System.out.print("Enter a number: ");
        n = sh.nextInt();
        p = 1;
        while (n != 0) {
            d = n % 10;
            p *= d;
            n/= 10;
        }

        System.out.println("Product of digits = " + p);

    }
}
