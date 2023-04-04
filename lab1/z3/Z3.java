package lab1.z3;

public class Z3 {
    public static void main(String[] args) {
        int n = 1;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < (Math.pow(10, i)); j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
