package lab1.z11;

import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 3;
        while (n < 4)
            n = scan.nextInt();
        int[] mas = new int[n + 1];
        int[] mas2 = new int[n + 1];
        int j = 0;
        mas2[0] = -1;
        for (int i = 0; i < n + 1; i++) {
            mas[i] = (int) (Math.random() * 999999);
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0) {
                mas2[j] = mas[i];
                j++;
            }
        }
        System.out.println("");
        for (int i = 0; i < j; i++) {
            System.out.print(mas2[i] + " ");
        }
    }
}
