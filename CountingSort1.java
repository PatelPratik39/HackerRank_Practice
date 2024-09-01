/**
 *  Counting Sort Algorithm is a efficient way to sort a small list. Instead of comparing elements directly,
 *  it counts the occurrence of an element
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort1 {

    private static List<Integer> countingSort1(List<Integer> arr) {

        // Initialize frequency array with 100 elements
        int[] frequency = new int[100];

        // Count the occurrences of each number in the input list
        for(int num : arr) {
            frequency[num]++;
        }

        // Convert the frequency array to a List<Integer>
        List<Integer> result = new ArrayList<>();
        for(int count : frequency) {
            result.add(count);
        }

        return result;
    }

    public static void main ( String[] args ) {
        List <Integer> arr = new ArrayList <>(Arrays.asList(1,1,3,2,1));
        System.out.println("Initial Array for Counting Sort : " + arr);
        System.out.println("Counting Sort: " +  countingSort1(arr));

    }


}
