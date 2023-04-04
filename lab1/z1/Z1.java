package lab1.z1;

import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.print("Enter a number: ");
        s = scanner.nextLine();
        double d = Double.parseDouble(s);
        for (int i = 1; i < 5; i++) {
            System.out.println(Math.pow(d, i));
        }
    }
}
