package lab2.z5;

public class Doubleee {
    public static void main(String[] args) {
        Double doubleObj1 = Double.valueOf(2.71828);
        Double doubleObj2 = Double.valueOf("3.14159");

        double doubleValue = Double.parseDouble("1.23456");
        byte byteValue = doubleObj1.byteValue();
        short shortValue = doubleObj1.shortValue();
        int intValue = doubleObj1.intValue();
        long longValue = doubleObj1.longValue();
        float floatValue = doubleObj1.floatValue();

        System.out.println("Value of doubleObj1 = " + doubleObj1);
        System.out.println("Value of doubleValue = " + doubleValue);
        System.out.println("Value of byteValue = " + byteValue);
        System.out.println("Value of shortValue = " + shortValue);
        System.out.println("Value of intValue = " + intValue);
        System.out.println("Value of longValue = " + longValue);
        System.out.println("Value of floatValue = " + floatValue);

        String doub = Double.toString(3.14);
        System.out.println("Value of doub =  " + doub);
    }
}