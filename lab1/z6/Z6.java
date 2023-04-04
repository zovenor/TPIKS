package lab1.z6;

public class Z6 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 0, n3 = 0;
        for (int i = 1; i <= 11; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
