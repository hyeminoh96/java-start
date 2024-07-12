package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter int (if 0, exit) :");
            int number = input.nextInt();

            if (number == 0){
                break;
            }

            sum += number;
        }
        System.out.println("Sum :" + sum);
    }
}
