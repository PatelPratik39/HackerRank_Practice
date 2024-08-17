import java.util.ArrayList;
import java.util.List;

/**
 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.
 *
 * Example
 *
 *
 * After  rotations, .
 *
 * Function Description
 *
 * Complete the rotateLeft function in the editor below.
 *
 * rotateLeft has the following parameters:
 *
 * int d: the amount to rotate by
 * int arr[n]: the array to rotate
 * Returns
 *
 * int[n]: the rotated array
 */
//public class LeftRotation {
//
//    private static void rotatedArray ( List<Integer> arr , int d) {
//        int n = arr.size();
//        for(int i=0; i < d; i++){
//            int temp = arr[0];
//            for (int j = 0; j < n-1; j++){
//                arr[j] = arr[j+1];
//            }
//            arr[n-1] = temp;
//        }
     import java.util.*;

        public class LeftRotation {

            private static List<Integer> rotatedArray(List<Integer> arr, int d) {
                int n = arr.size();

                // Create the rotated array using slicing and concatenation
                List<Integer> rotatedArray = new ArrayList<>(arr.subList(d, n));
                rotatedArray.addAll(arr.subList(0, d));

                return rotatedArray;
            }

            public static void main(String[] args) {

                int d = 2;
                List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

                // Call the rotation method and get the result
                List<Integer> rotatedList = rotatedArray(list, d);

                // Print the rotated list
                for (int i : rotatedList) {
                    System.out.print(i + " ");
                }
            }
        }
