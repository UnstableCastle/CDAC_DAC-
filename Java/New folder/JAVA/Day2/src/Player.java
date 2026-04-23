public class Player {
private String playerName;
private String playerCountry;


public Player() {
//	System.out.println("defualt Constructor");
//	this("Sachin");
	playerCountry="India";
}

public Player(String playerName) {
	this();
	this.playerName=playerName;

}


public String toString() {
	return "Player = [PlayerName = "+playerName+" , PlayerCountry = "+playerCountry+" ]";
}

public static void main(String args[]) {
	Player p = new Player("Castle");
	System.out.println(p);
	
}




}
