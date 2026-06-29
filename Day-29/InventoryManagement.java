import java.util.*;
 class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemName;
        int quantity;
        double price, totalValue;
        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
        System.out.print("Enter Price per Item: ");
        price = sc.nextDouble();
        totalValue = quantity * price;
        System.out.println("\n----- Inventory Details -----");
        System.out.println("Item Name      : " + itemName);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Price per Item : " + price);
        System.out.println("Total Value    : " + totalValue);
    }
}