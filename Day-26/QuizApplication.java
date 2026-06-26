import java.util.*;
public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Quiz Application");
        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Chennai");
        char ans1 = sc.next().charAt(0);
        if (ans1 == 'b') {
            score++;
        }
        System.out.println("2. 5 + 3 = ?");
        System.out.println("a) 6");
        System.out.println("b) 7");
        System.out.println("c) 8");
        char ans2 = sc.next().charAt(0);
        if (ans2 == 'c') {
            score++;
        }
        System.out.println("Your Score = " + score + "/2");
    }
}
