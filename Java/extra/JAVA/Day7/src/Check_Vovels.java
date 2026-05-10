
public class Check_Vovels {

	    public static void main(String[] args) {
	        
	        String str = "AEIOU";
	        int count = 0;
	        
	        for(int i = 0; i < str.length(); i++) {
	            
	          
	            String currentLetter = String.valueOf(str.charAt(i));
	            
	           
	            if (currentLetter.toLowerCase().contains("a") || 
	                currentLetter.toLowerCase().contains("e") || 
	                currentLetter.toLowerCase().contains("i") || 
	                currentLetter.toLowerCase().contains("o") || 
	                currentLetter.toLowerCase().contains("u")) {
	                
	                count++;
	            }
	        }
	        
	        System.out.println("count = " + count);
	    }
}