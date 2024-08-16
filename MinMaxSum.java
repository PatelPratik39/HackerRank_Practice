import java.util.Arrays;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 */

public class MinMaxSum {

    private static void printMinMaxSum ( int[] arr ) {
        Arrays.sort(arr);  //sort the array
//        find minSum
        long minSum = 0;
        for(int i =0; i < 4; i++){
            minSum += arr[i];
        }
//        find MaxSum
        long maxSum = 0;
        for(int i = 1; i< 5; i++){
            maxSum += arr[i];
        }
        System.out.println(minSum + " " + maxSum);
    }
    public static void main ( String[] args ) {
        int arr[] = {1,3,5,7,9};
        printMinMaxSum(arr);
    }


}
