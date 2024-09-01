/**
 *  Insertion Sort
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InsertionSort1 {

    private static void insertElement (int n, List< Integer> arr ) {
//        first i need to select and element that needs to be set in sorted array
        int value = arr.get(n -1);
//        i need to set starting point of an array for loop
        int i = n -2;

        //run a loop until value - 1 < value <  value + 1
        while(i >= 0 && arr.get(i)> value){
            arr.set(i + 1, arr.get(i));  // shift current element to 1 step right
//            printArr(arr);  // updated array should look like this
            i--;
        }
        arr.set(i + 1, value);
    }
    public static void printArr(List<Integer> arr){
        for(Integer num :  arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 6, 8, 9, 10, 13, 14, 7));
        System.out.println("Initial Array  : " + arr);

        insertElement(arr.size(), arr);
//        System.out.println();
        System.out.println("Final Sorted Array: ");
        printArr(arr);  // Print the final sorted array
    }


}
