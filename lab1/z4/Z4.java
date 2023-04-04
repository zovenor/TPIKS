package lab1.z4;

import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, b;
        i = (int) (Math.random() * 10 + 1);
        System.out.print("Try to predict the number in range from 1 to 10: ");
        scanner.hasNextInt();
        b = scanner.nextInt();
        while (b != i) {
            System.out.print("The number is incorrect!");
            if (b > i) {
                System.out.println("The specified number is less than yours!");
            } else if (b < i) {
                System.out.println("The specified number is more than yours!");
            }
            System.out.print("Enter the number again: ");
            scanner.hasNextInt();
            b = scanner.nextInt();
        }
        System.out.println("You guessed right!");
    }
}
