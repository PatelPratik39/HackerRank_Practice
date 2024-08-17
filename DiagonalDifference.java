import java.util.Map;
import java.util.Scanner;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 */


public class DiagonalDifference {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //input size of matrix
        int[][] matrix = new int[n][n];  // declare the matrix

//        now input the matrix element
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

//        calculate the Sum of Diagonal
        int primaryDiagonalsSum = 0;
        int secondaryDiagonalSum = 0;

        for(int i =0; i< n; i++){
            primaryDiagonalsSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n-i-1];
        }

        int diagonalDifference = Math.abs(primaryDiagonalsSum - secondaryDiagonalSum);
        System.out.println(diagonalDifference);
        sc.close();
    }
}
