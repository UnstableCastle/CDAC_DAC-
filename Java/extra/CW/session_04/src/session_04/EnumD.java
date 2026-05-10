package session_04;
public class EnumD {
	public enum Coffee{ SMALL(60),MEDIUM(75),LARGE(90);	
		private int price;
		
		private Coffee(int price)
		{
			this.price = price;
		}
		
		public int getPrice()
		{
			return price;
		}
	}
	public static void main(String[] args) {	
		Coffee c = Coffee.MEDIUM;
		System.out.println(c+" size Coffee costs: "
				+ "Rs."+c.getPrice());	
	}
}
