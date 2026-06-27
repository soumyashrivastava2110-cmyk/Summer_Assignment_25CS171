import java.util.*;
class SalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double basic, hra, da, grossSalary;
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
        hra = basic * 0.20;  
        da = basic * 0.10;    
        grossSalary = basic + hra + da;
        System.out.println("\n--- Salary Details ---");
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
    }
}