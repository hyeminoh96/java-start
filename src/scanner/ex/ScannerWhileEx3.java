package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input;

//        while (true){
//
//            System.out.print("Enter num: ");
//            int num = scanner.nextInt();
//
//            if (num == -1){
//                System.out.println("Sum = " + sum);
//                System.out.println("Avg = " + (double) sum / count);
//                break;
//            }
//            count += 1;
//            sum += num;
//        }

        while ((input = scanner.nextInt()) != -1){
            sum += input;
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + (double) sum / count);
    }
}
