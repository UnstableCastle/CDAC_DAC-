import java.util.Comparator;

public class MyComparator2 implements Comparator<String> {

	@Override
	public int compare(String i1, String i2) {
		if(i1.charAt(0)<i2.charAt(0))
			return +1;
		else if (i1.charAt(0)>i2.charAt(0))
			return -1;
		else
			for(int i =0 ; i<i1.length();i++) {
				if(i1.charAt(i)>i2.charAt(i))
					return -1;
			}
			return 0;
	}

}
