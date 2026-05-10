import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, cols;

        System.out.println("Enter number of rows:");
        rows = s.nextInt();
        System.out.println("Enter number of columns:");
        cols = s.nextInt();

        int[][] arr = new int[rows][cols];

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr[i][j] = s.nextInt(); 
            }
        }

        
        System.out.println("\nArray Elements Matrix:");
        for (int[] row : arr) {
            for (int element : row) {
               
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        
        s.close(); 
    }
}