import java.util.Scanner;
class Rangearmstrong
 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sh.nextInt();

        System.out.print("Enter end of range: ");
        int end = sh.nextInt();

        System.out.println("Armstrong numbers in the range:");

        for (int num = start; num <= end; num++) {
            int original = num;
            int temp = num;
            int digits = String.valueOf(num).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }
    }
}
