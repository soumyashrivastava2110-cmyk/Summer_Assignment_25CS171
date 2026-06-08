import java.util.*;
 class LargestPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long largestFactor = 0;

        // Remove factors of 2
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        // Check odd factors
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        // If n is a prime number greater than 2
        if (n > 2) {
            largestFactor = n;
        }

        System.out.println("Largest Prime Factor = " + largestFactor);

        
    }
}
