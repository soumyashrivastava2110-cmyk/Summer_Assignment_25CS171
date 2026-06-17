import java.util.*;
 class IntersectionArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new LinkedHashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Intersection of arrays:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}