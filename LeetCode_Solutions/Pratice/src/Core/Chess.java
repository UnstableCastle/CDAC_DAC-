package Core;

public class Chess implements Playable {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play chess");
	}
	public static void main(String[] args) {
		Chess c = new Chess();
		c.play();
//		c.MAX_PLAYERS=2;
		System.out.println(c.MAX_PLAYERS);
	}

}
