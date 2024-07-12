package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of food: ");
        String foodName = scanner.nextLine();

        System.out.print("Enter price: ");
        int foodPrice = scanner.nextInt();

        System.out.print("Enter amount: ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println("You ordered " + foodName + " " + foodQuantity);
        System.out.println("Price is " + totalPrice);
    }
}
