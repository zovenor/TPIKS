package lab2.z1;

public class Circle {
    private double radius;
    private double x0, y0;

    public Circle() {
        radius = 10;
        x0 = 0;
        y0 = 0;
    }

    public Circle(double _radius) {
        radius = _radius;
        x0 = 0;
        y0 = 0;
    }

    public Circle(double _x0, double _y0) {
        radius = 10;
        x0 = _x0;
        y0 = _y0;
    }

    public Circle(double _radius, double _x0, double _y0) {
        radius = _radius;
        x0 = _x0;
        y0 = _y0;
    }

    public void show() {
        System.out.println("Radius = " + radius + "; X0 = " + x0 + "; Y0 = " + y0);
    }

    public void set_coord(double _x0_delta, double _y0_delta) {
        x0 += _x0_delta;
        y0 += _y0_delta;
    }

    public void set_radius(double _radius) {
        radius = _radius;
    }

    public double get_area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double get_lenght() {
        return 2.0 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.show();
    }
}
