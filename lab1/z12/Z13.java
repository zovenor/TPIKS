package lab1.z12;

public class Z13 {
    public static void main(String[] args) {
        int[][] mas = new int[15][2];
        int n, m;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 2; j++) {
                mas[i][j] = 1;
            }
        }
        for (int i = 0; i < 15; i++) {
            n = (int) (Math.random() * 8) + 2;
            m = (int) (Math.random() * 8) + 2;
            for (int x = 0; x < 15; x++) {
                for (int y = 0; y < 2; y++) {
                    if (n == mas[x][y] && y == 1) {
                        if (m == mas[x][y - 1]) {
                            continue;
                        }
                    } else if (n == mas[x][y] && y == 0) {
                        if (m == mas[x][y + 1]) {
                            continue;
                        }
                    }
                }
            }
            mas[i][0] = n;
            mas[i][1] = m;
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(mas[i][0] + "x" + mas[i][1]);
        }
    }
}
