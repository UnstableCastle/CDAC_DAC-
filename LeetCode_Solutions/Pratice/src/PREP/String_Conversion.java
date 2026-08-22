package PREP;

import java.util.Scanner;

public class String_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read input
        int n = sc.nextInt();
        String s = sc.next();
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int totalOperations = 0;
        
        // 2. Loop through each character in the string
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int minDistance = 26; // Max possible distance is 25
            
            // 3. Find the shortest forward distance to any vowel
            for (char v : vowels) {
                int dist;
                if (v >= c) {
                    dist = v - c; // Vowel is ahead of or equal to current char
                } else {
                    dist = (v - c) + 26; // Vowel is behind, must wrap around 'z' to 'a'
                }
                
                if (dist < minDistance) {
                    minDistance = dist;
                }
            }
            
            // 4. Add the minimum operations for this character to the total
            totalOperations += minDistance;
        }
        
        // 5. Print the final result
        System.out.println(totalOperations);
        
        sc.close();
    }
}