import java.util.*;

 class Reverse
  {
    public static void main(String[] args) 
    {
        Scanner sh = new Scanner(System.in);
        int n, r,d;
        System.out.print("Enter a number: ");
        n = sh.nextInt();
        r= 0;

        while (n != 0)
        {
            d= n % 10;
            r = r * 10 + d;
            n = n / 10;
        }

        System.out.println("Reversed number = " + r);

    }
}