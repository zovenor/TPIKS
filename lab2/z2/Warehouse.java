package lab2.z2;

public class Warehouse {
    int quantity;
    double price;

    public Warehouse() {
        this.quantity = 0;
        this.price = 0;
    }

    public Warehouse(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public double calculateCost() {
        return quantity * price;
    }


    public int compareCost(Warehouse otherWarehouse) {
        double thisCost = calculateCost();
        double otherCost = otherWarehouse.calculateCost();

        if (thisCost < otherCost) {
            return -1;
        } else if (thisCost > otherCost) {
            return 1;
        } else {
            return 0;
        }
    }


    public static int getTotalQuantity(Warehouse... warehouses) {
        int totalQuantity = 0;
        for (Warehouse s : warehouses) {
            totalQuantity += s.quantity;
        }
        return totalQuantity;
    }

    public static void main(String[] args) {
        Warehouse s1 = new Warehouse(10, 2.7);
        Warehouse s2 = new Warehouse(20, 3.5);

        System.out.println("Count1: " + s1.quantity + ", Cost1: " + s1.price);
        System.out.println("Count2: " + s2.quantity + ", Cost2: " + s2.price);


        s1.setQuantity(16);
        System.out.println("Count1: " + s1.quantity + ", Cost1: " + s1.price);


        s2.setPrice(2.0);


        double cost1 = s1.calculateCost();
        double cost2 = s2.calculateCost();


        int cmp = s1.compareCost(s2);


        int totalQuantity = Warehouse.getTotalQuantity(s1, s2);


    }
}