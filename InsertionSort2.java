import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort2 {

    private static void insertElement ( int n, List< Integer> arr ) {

        for(int i = 1;  i < n; i++){
            int value = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > value){
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j+1, value);
            printArray(arr);
        }

    }

    private static void printArray ( List< Integer> arr ) {
        for(Integer num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main ( String[] args ) {
        List <Integer> arr = new ArrayList <>(Arrays.asList(1, 4, 3, 5, 6, 2));
        System.out.println("Initial Array  : " + arr);

        insertElement(arr.size(), arr);
//        System.out.println();
        System.out.println("Final Sorted Array: ");
        printArray(arr);  // Print the final sorted array
    }



}
