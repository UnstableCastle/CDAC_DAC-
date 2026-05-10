
public class MatrixTranspose {
    public static void main(String[] args) {
     
        int[][] original = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        int rows = original.length;
        int cols = original[0].length;
        
        int[][] transpose = new int[cols][rows];
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = original[i][j];
            }
        }
        
        
        System.out.println("Original Matrix:");
        printMatrix(original);
        
        
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }
    
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}