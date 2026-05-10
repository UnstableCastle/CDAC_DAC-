import java.util.Scanner;

public class Sum_Of_17_Elements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no of rows: ");
        int row = s.nextInt();
        
        int arr[][] = new int[row][];
        
        for(int i = 0; i < row; i++) {
            System.out.print("Enter number of cols for row " + i + ": ");
            int cols = s.nextInt();
            
            arr[i] = new int[cols];
            
            for(int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = s.nextInt();
            }
        }
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        
        System.out.println("\nSum of Array elements is: " + sum);
        
        s.close();
    }
}