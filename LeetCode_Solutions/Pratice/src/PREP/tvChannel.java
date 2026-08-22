package PREP;

import java.util.Scanner;

public class tvChannel {
	public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read N and K
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // 2. Josephus Problem mathematical logic (Iterative)
        int survivor = 0; // We use 0-based indexing for the math to work smoothly
        
        for (int i = 2; i <= n; i++) {
            survivor = (survivor + k) % i;
        }
        
        // 3. Convert back to 1-based indexing (channels start at 1) and print
        System.out.println(survivor + 1);
        
        sc.close();
    }
}
