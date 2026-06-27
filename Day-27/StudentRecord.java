import java.util.*;
 class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        double marks;
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        System.out.println("\n--- Student Record ---");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("Marks : " + marks);
    }
}