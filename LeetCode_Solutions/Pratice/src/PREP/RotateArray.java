package PREP;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read size
        int n = sc.nextInt();
        
        // 2. Read array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 3. Read K
        int k = sc.nextInt();
        
        // 4. Optimize K (Crucial step! If K is bigger than N, it wraps around)
        k = k % n;
        
        // 5. Create a new array to hold the rotated result
        int[] rotated = new int[n];
        
        // 6. Loop through the original array
        for(int i = 0; i < n; i++) {
            
            // MATH TRICK: The new position for the element at index 'i' 
            // is (i + k) % n. 
            int newPosition = (i + k) % n;
            
            // Put arr[i] into the 'rotated' array at 'newPosition'
            // TODO: write that code here
          
        	   rotated[newPosition]=arr[i];
           
        }
        
        // 7. Loop through the 'rotated' array and print it with spaces!
        // TODO: Use a loop and System.out.print(rotated[i] + " ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
        sc.close();
    }
}