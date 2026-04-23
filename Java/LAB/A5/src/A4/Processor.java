package A4;

abstract class Processor {
	int data;

	Processor(int data) {
		this.data = data;
	}

	void showData() {
		System.out.println("Data: " + data);
	}

	abstract void process();
}