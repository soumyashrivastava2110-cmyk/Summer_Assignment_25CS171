import java.util.*;
public class SortName
 {
    public static void main(String[] args) 
    {
        String[] names = {"Rahul", "Aman", "Neha", "Priya", "Vikas"};
        Arrays.sort(names);
        System.out.println("Names in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}