
public class EnumSeasons {

	public enum Seasons{WINTER , SUMMER , RAINY};
		public static void main(String[] args) {
			Seasons s = Seasons.SUMMER;
			System.out.println(s);
			System.out.println("----------------");
			
			for(Seasons s1 :Seasons.values()) {
				System.out.println(s1+"    "+s1.ordinal());
			}
			
		}
		
	}