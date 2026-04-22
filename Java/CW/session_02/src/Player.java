public class Player {	
	private String playerName;
	private String playerCountry;
	
	public Player()
	{
		//this("Sachin");//Constructor chaining
		playerCountry = "India";
	}

	public Player(String playerName)
	{
		this();//needs to be the first statement
		this.playerName = playerName;
	}
	
	//method of Object(java.lang) class
	//String Representation of an Object
	public String toString() {
		return "Player [playerName=" + playerName + ","
				+ " playerCountry=" + playerCountry + "]";
	}

	public static void main(String[] args) {
		  Player p = new Player("Virat"); 
		  System.out.println(p);
		/*
		 * Player p = new Player();
		 *  System.out.println(p);
		 */	
	}
}
