package lab1.z7;

public class Z7 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 999999; i++) {
            if (((i / 100000) + (i / 10000 % 10) + (i / 1000 % 10)) == ((i % 10) + (i / 100 % 10) + (i / 10 % 10))) {
                n++;
            }
        }
        System.out.println(n);
    }
}