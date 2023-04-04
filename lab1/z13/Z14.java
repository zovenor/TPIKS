package lab1.z13;

import java.util.Scanner;

public class Z14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -999999, min = 999999, nummax = 0, nummin = 0, buffer;
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] mas = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (min >= mas[i][j]) {
                    nummin = j;
                    min = mas[i][j];
                }
            }
            buffer = mas[i][m - 1];
            mas[i][m - 1] = mas[i][nummin];
            mas[i][nummin] = buffer;
            min = 999999;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max <= mas[i][j]) {
                    nummax = j;
                    max = mas[i][j];
                }
            }
            buffer = mas[i][0];
            mas[i][0] = mas[i][nummax];
            mas[i][nummax] = buffer;
            max = -999999;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }
    }
}