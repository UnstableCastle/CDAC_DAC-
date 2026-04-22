import java.util.Vector;

public class vector_element {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10, 5);// increase capacity
		System.out.println(v.capacity());

		for (int i = 0; i <= 15; i++) {
			v.addElement(i);

		}
		System.out.println(v);

		for (int i = 0; i < 5; i++) {
			v.remove(i);

		}
		System.out.println(v);
	}
}