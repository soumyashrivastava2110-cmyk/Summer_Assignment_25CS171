import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sh= new Scanner(System.in);
         System.out.print("Enter a number: ");
        int n,c;
         n = sh.nextInt();
        c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }

        System.out.println("Number of digits = " + c);
    }
}
    

