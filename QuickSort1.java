import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort1 {
    public static List<Integer> quickSort1 ( List< Integer> arr ) {
//        using Quick sort , i need to use pivot and divide and conquer rule
        int pivot = arr.get(0);   //define a pivot at index at 0th position

//        create separate Arraylist so i can add the partitions and later o will merge it
        List<Integer> left = new ArrayList <>();
        List<Integer> right = new ArrayList <>();
        List<Integer> equal = new ArrayList <>();

//        now iterate over an array to divide the elements based on pivot
        for(int num : arr){
            if(num < pivot){
                left.add(num);
            } else if( num > pivot){
                right.add(num);
            } else {
                equal.add(num);
            }
        }
//        now merge all the array lists
        List<Integer> result = new ArrayList <>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        return result;


    }

    public static void main ( String[] args ) {
        List <Integer> arr = new ArrayList <>(Arrays.asList(5,7,4,3,8));
        System.out.println("Initial Array : " + arr);

        System.out.println(quickSort1(arr));

    }


}
