import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort2 {

    private static List<Integer> countingSort2 ( List< Integer> arr ) {
        int[] frequnecy = new int[100]; // created a frequency Array

//        find occurrence of each element in the input array
        for(int num : arr){
            frequnecy[num]++;
        }

        List<Integer> result = new ArrayList<>();  // create new arraylist where i can store the new list

//     populate the result in sorted order
        for(int i = 0; i < frequnecy.length; i++){
            for(int j = 0; j < frequnecy[i]; j++){
                result.add(i);  //adding number of i times frequnecy
            }
        }
        return result;  // return the sorted list

    }

    public static void main ( String[] args ) {
        List <Integer> arr = new ArrayList <>(Arrays.asList(1, 1, 3, 2, 1));
        System.out.println("Initial Array for Counting Sort: " + arr);
        System.out.println("Counting Sort: " + countingSort2(arr));
    }


}
