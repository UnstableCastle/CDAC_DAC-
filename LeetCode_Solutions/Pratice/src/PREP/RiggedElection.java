package PREP;
import java.util.*;
public class RiggedElection {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int majority = n/2;
	
	int arr[] = new int[n];
	
	for(int i =0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	for(int i:arr) {
		map.put(i,map.getOrDefault(i, 0)+1);
	
		if(map.get(i)>majority) {

			sc.close();
			System.out.println(i);
			return;
		}
	
	
	}
	
	sc.close();
	System.out.println(-1);
	return;
	
	
}
}
