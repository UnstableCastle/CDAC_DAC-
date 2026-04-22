package A4;

class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax() {
        double tax = price * salesTax;
        System.out.println("Sales Tax: " + tax);
    }
}
