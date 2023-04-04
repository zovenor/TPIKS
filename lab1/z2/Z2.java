package lab1.z2;

import java.util.Scanner;

public class Z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b, i = 666;
        System.out.print("Enter a password: ");
        scanner.hasNextInt();
        b = scanner.nextInt();
        while (b != i) {
            System.out.println("Password is incorrect! Try again!");
            System.out.print("Enter a password: ");
            scanner.hasNextInt();
            b = scanner.nextInt();
        }
        System.out.print("Password is correct!");
    }
}
