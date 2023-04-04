package lab1.z8;

public class Z9 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 150) + 5;
        if ((n > 25) && (n < 100)) {
            System.out.println("number " + n + " correct");
        } else {
            System.out.println("number " + n + " incorrect");
        }
    }
}
