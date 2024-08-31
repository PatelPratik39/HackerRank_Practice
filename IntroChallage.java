import java.util.Arrays;
import java.util.List;

public class IntroChallage {

    private static int introTutorial ( int V, List< Integer> arr ) {
//        lenear Search   => O(n)
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == V){
                return i;
            }
        }
        return -1;



        //Binary Search Approach    => O(log n)
//        int left = 0;
//        int right = arr.size() - 1;
//
//        while(left <= right){
//            int mid = left + (right - left) / 2; // it avoids Integer Overflow
//            if(arr.get(mid) == V){
//                return mid;
//            } else if( arr.get(mid) < V){
//                left = mid + 1;
//            } else{
//                right = mid -1;
//            }
//        }
//        return -1;
    }
    public static void main ( String[] args ) {
        int V = 4;
        List <Integer> arr = Arrays.asList(1, 4, 5, 7, 9, 12);

        int result = introTutorial(V, arr);
        System.out.println(result);
    }


}
