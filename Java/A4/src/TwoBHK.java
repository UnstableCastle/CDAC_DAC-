
public class TwoBHK extends OneBHK {

	
	private double room2Area;

	public TwoBHK() {
	}

	public TwoBHK(double roomArean, double hallArea, double price, double room2Area) {

		super(room2Area,hallArea,price);
		this.room2Area=room2Area;
		
	}
	@Override
	public void show() {
		System.out.println("TwoBHK [room2Area=" + room2Area + ", roomArea=" + roomArea + ", hallArea=" + hallArea + ", price="
				+ price + "]");
	}

	public double getPrice() {
		return price;
	}
}
