import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        
        int nameCompare = e1.getName().compareTo(e2.getName());
        
        if (nameCompare != 0) {
            return nameCompare;
        }
        
        return Integer.compare(e1.getEmpId(), e2.getEmpId());
    }
}
