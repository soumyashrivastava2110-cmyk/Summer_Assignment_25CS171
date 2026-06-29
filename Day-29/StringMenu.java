import java.util.*;
public class StringMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("\n1. Convert to Uppercase");
        System.out.println("2. Convert to Lowercase");
        System.out.println("3. Find Length");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Uppercase: " + str.toUpperCase());
                break;

            case 2:
                System.out.println("Lowercase: " + str.toLowerCase());
                break;

            case 3:
                System.out.println("Length: " + str.length());
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
