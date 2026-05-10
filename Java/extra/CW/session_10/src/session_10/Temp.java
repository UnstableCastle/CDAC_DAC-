package session_10;
public class Temp {
	private int i;
	public Temp() {}

	public Temp(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public String toString() {
		return i+"";
	}
	
	

}
