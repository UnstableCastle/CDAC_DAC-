package A4;

class Circle extends Processor {

    Circle(int data) {
        super(data);
    }

    void process() {
        double area = 3.14 * data * data;
        System.out.println("Circle Area: " + area);
    }
    public static void main(String[] args) {
		Processor c = new Circle(23);
		c.showData();
		c.process();
	}
}