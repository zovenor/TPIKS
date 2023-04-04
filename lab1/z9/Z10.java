package lab1.z9;

public class Z10 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 28800);
        if (n >= 18000) {
            System.out.println((n / 3600) + " hours left");
        } else if (n < 18000 && n > 7200) {
            System.out.println((n / 3600) + " hours left");
        } else if (n < 7200 && n >= 3600) {
            System.out.println("1 hour left");
        } else {
            System.out.println("Less than one hour");
        }
    }
}