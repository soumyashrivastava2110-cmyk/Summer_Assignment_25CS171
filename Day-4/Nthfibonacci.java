import java.util.*;

class Nthfibonacci {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sh.nextInt();

        int a = 0, b = 1;

        if (n == 1) {
            System.out.println("Nth Fibonacci term = " + a);
        } else if (n == 2) {
            System.out.println("Nth Fibonacci term = " + b);
        } else {
            int c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Nth Fibonacci term = " + b);
        }
    }
}