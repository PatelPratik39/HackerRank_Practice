import java.util.Scanner;

/**
 * Given a  2D Array, :
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * An hourglass in  is a subset of values with indices falling in this pattern in 's graphical representation:
 *
 * a b c
 *   d
 * e f g
 * There are  hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be .
 *
 * Example
 *
 *
 * -9 -9 -9  1 1 1
 *  0 -9  0  4 3 2
 * -9 -9 -9  1 2 3
 *  0  0  8  6 6 0
 *  0  0  0 -2 0 0
 *  0  0  1  2 4 0
 * The  hourglass sums are:
 *
 * -63, -34, -9, 12,
 * -10,   0, 28, 23,
 * -27, -11, -2, 10,
 *   9,  17, 25, 18
 * The highest hourglass sum is  from the hourglass beginning at row , column :
 *
 * 0 4 3
 *   1
 * 8 6 6
 * Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
 *
 * Function Description
 *
 * Complete the function hourglassSum in the editor below.
 *
 * hourglassSum has the following parameter(s):
 *
 * int arr[6][6]: an array of integers
 * Returns
 *
 * int: the maximum hourglass sum
 * Input Format
 *
 * Each of the  lines of inputs  contains  space-separated integers .
 */

public class HourGlassSum {

    private static int hourGlassSum ( int[][] arr ) {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <=3 ; i++){
            for(int j = 0; j <= 3; j++){
                int currentSum = arr[i][j] + arr[i][j+1] + arr[i] [j+2] + arr[i+1][j+1]
                        +arr[i+2][j] + arr[i+2][j+1]+ arr[i+2][j+2];

                maxSum = Math.max(maxSum ,currentSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int result = hourGlassSum(arr);
        System.out.println("Maximum hourglass sum: " + result);  // Output should be 28
    }

//    public static void main ( String[] args ) {
//        Scanner scanner = new Scanner(System.in);
//        int[][] arr = new int[6][6];
//
//        System.out.println("Please enter 36 integers (6x6 array):");
//        for(int i = 0; i < 6;i++){
//            for(int j=0; j< 6; j++){
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//
//        int result = hourGlassSum(arr);
//        System.out.println("Maximum hourglass sum: " + result);
//
//        scanner.close();
//
//    }


}
