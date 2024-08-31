
/**
 *Consider an array of numeric strings where each string is a positive number with anywhere from  to  digits. Sort the array's elements in non-decreasing, or ascending order of their integer values and return the sorted array.
 *
 * Example
 *
 * Return the array ['1', '3', '150', '200'].
 *
 * Function Description
 *
 * Complete the bigSorting function in the editor below.
 *
 * bigSorting has the following parameter(s):
 *
 * string unsorted[n]: an unsorted array of integers as strings
 * Returns
 *
 * string[n]: the array sorted in numerical order
 * Input Format
 *
 * The first line contains an integer, , the number of strings in .
 * Each of the  subsequent lines contains an integer string, .
 *
 * Constraints
 *
 * Each string is guaranteed to represent a positive integer.
 * There will be no leading zeros.
 * The total number of digits across all strings in  is between  and  (inclusive).
 *
 */
import java.util.Arrays;
import java.util.List;


public class BigSorting {

    private static List<String> bigSorting ( List<String> unsorted ) {
//        sort the list using custom comparator
        unsorted.sort((a,b) -> {
            if(a.length() == b.length()){
                return a.compareTo(b);
            } else{
                return a.length() - b.length();
            }
        });
        return unsorted;

    }

    public static void main ( String[] args ) {
        List <String> unsorted = Arrays.asList("3", "150", "1", "200");
        List<String> sorted = bigSorting(unsorted);
        for(String num : sorted){
            System.out.println(num);
        }
    }

}
