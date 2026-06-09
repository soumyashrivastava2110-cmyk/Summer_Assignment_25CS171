import java.util.*;

class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();

        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            long lastDigit = binary % 10;
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal equivalent: " + decimal);

        
    }
}