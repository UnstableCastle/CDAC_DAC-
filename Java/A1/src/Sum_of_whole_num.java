import java.util.Scanner;

public class Sum_of_whole_num {

    public static void main(String[] args) {
        int n, i = 1;
        int sum = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to calculate sum:");
        n = s.nextInt();
        
    
        while(i <= n) {
            sum += i;
            i++;
        }
        
        
        System.out.println("Sum of 1 to " + n + " is: " + sum);
        
  
        s.close();
    }
}