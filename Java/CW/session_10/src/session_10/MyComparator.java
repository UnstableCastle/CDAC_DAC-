package session_10;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		String n1 =  e1.getEmpName();
		String n2 = e2.getEmpName();
		int i =  n1.compareTo(n2);
		if(i == 0 )
		{
	return Integer.compare(e1.getEmpId(), e2.getEmpId());
		}
		return i;
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
