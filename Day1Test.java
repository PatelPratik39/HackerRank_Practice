import java.util.Arrays;

public class Day1Test {

    private static void printMedian ( int[] arr ) {
//        to make process easy i need to use Sorting method first
        Arrays.sort(arr);

        int n = arr.length; //find the length of an array

        int median = n / 2;  //find median by dividing length /2

        if(n % 2 == 1){
            System.out.println(arr[median]);
        } else {
            int medianIndex = (arr[median - 1] + arr[median]) / 2;
            System.out.println(medianIndex);
        }

//        System.out.println(arr[median]);
    }
    public static void main ( String[] args ) {
        int[] arr = {12, 3, 5, 6,7, 19};
        printMedian(arr);
    }
}
