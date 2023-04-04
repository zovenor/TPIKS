package lab1.z10;

public class Z11 {
    public static void main(String[] args) {
        int[] mas = new int[12];
        int max = -16, num = 0;
        for (int i = 0; i <= 11; i++) {
            mas[i] = (int) (Math.random() * 30) - 15;
            if (mas[i] >= max) {
                max = mas[i];
                num = i + 1;
            }
        }
        for (int i = 0; i <= 11; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
        System.out.println(num);
    }
}
