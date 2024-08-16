/**
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 */

public class LonelyInteger {

    private static int printLonelyInt ( int[] a ) {

//        to find out a unique element from an array, i need to use XOR approach that bitwise operator
        int unique = 0;
        for(int i : a){
            unique ^= i;
        }
        return unique;

    }
    public static void main ( String[] args ) {
        int[] a = {1,2,3,4,3,2,1};
        System.out.println(printLonelyInt(a));
    }
}
