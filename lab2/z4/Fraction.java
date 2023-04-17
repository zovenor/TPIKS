package lab2.z4;

public class Fraction {
    double n, m;

    public Fraction() {

    }

    public Fraction(double n, double m) {
        this.n = n;
        this.m = m;
    }

    public void sum(Fraction... ob) {
        double sum = this.n / this.m;
        for (int i = 0; i < ob.length; i++) {
            sum += ob[i].n / ob[i].m;
        }
        System.out.println("Sum: " + sum);
    }

    public void subtraction(Fraction ob) {
        double sub = this.n / this.m + ob.n / ob.m;
        System.out.println("Difference: " + sub);
    }

    public void multiplication(Fraction... ob) {
        double mult = this.n / this.m;
        for (int i = 0; i < ob.length; i++) {
            mult *= ob[i].n / ob[i].m;
        }
        System.out.println("Product: " + mult);
    }

    public void division(Fraction ob) {
        double div = this.n / this.m / ob.n / ob.m;
        System.out.println("Division: " + div);
    }

    public static double gcd(double a, double b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void reduction() {
        double d = gcd(Math.abs(n), Math.abs(m));
        System.out.println(this.n / d + "/" + this.m / d);
    }

    public void show() {
        System.out.println("Fraction: " + '\n'
                + this.n + '\n'
                + this.m);
    }

    public static void change(Fraction[] ob) {
        int size = ob.length;
        if (ob.length % 2 != 0)
            size--;
        for (int i = 0; i < size; i += 2) {
            ob[i].sum(ob[i + 1]);
        }
    }

    public static void main(String[] args) {
        Fraction fraction[] = new Fraction[6];
        fraction[0] = new Fraction(1, 4);
        fraction[1] = new Fraction(7, 3);
        fraction[2] = new Fraction(4, 6);
        fraction[3] = new Fraction(3, 6);
        fraction[4] = new Fraction(6, 5);
        fraction[5] = new Fraction(5, 9);

        for (int i = 0; i < fraction.length; i++) {
            fraction[i].show();
        }

        fraction[0].sum(fraction[1], fraction[2]);
        fraction[3].subtraction(fraction[2]);
        fraction[2].multiplication(fraction[4], fraction[5]);
        fraction[1].division(fraction[0]);
        fraction[2].reduction();

        Fraction.change(fraction);
    }
}