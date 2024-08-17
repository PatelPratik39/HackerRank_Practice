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
public class LeftRotation {

    private static void rotatedArray ( List<Integer> arr , int d) {
        int n = arr.size();
//        for(int i=0; i < d; i++){
//            int temp = arr[0];
//            for (int j = 0; j < n-1; j++){
//                arr[j] = arr[j+1];
//            }
//            arr[n-1] = temp;
//        }

        List <Integer> rotatedArray = new ArrayList <>(arr.subList(d,n));
        rotatedArray.addAll(arr.subList(0,d));
    }

    public static void main ( String[] args ) {


        int d = 2;
        List<Integer> list = new ArrayList <>();
        int list = {1,2,3,4,5};
        rotatedArray(List<Integer> arr, d);

        for(int i : arr){
            System.out.print(i + " ");
        }

    }
}
