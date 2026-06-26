import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 25; 
        int guess;
        System.out.println("Guess the number (1 to 50):");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Correct! You guessed the number.");
            } else {
                System.out.println("Wrong! Try again.");
            }
        } while (guess != number);
    }
}
