/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with  places after the decimal.
 * Example
 *
 * There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
 *
 * 0.400000
 * 0.400000
 * 0.200000
 */

public class PlusMinus {
    private static void printPlusMinus ( int[] arr ) {
        int n = arr.length;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) positiveCount++;
            else if (num < 0) negativeCount++;
            else zeroCount++;
        }
        System.out.println((double) positiveCount / n);
        System.out.println((double) negativeCount / n);
        System.out.println((double) zeroCount / n);
    }

    public static void main ( String[] args ) {
        int[] arr = {1,1,0,-1,-1};
        printPlusMinus(arr);
//        System.out.println(printPlusMinus(arr));
    }


}
