
public class Break_continue {

public static void main(String []args) {
		
		for(int i = 1; i<=3;i++){
			
			
			for(int j = 1 ; j<=3;j++) {
				if(i==2 && j==3)
//					break;
					continue;
				System.out.println(i+""+j);
				
			}
			System.out.println();
		}
		
		
	}
	
}
