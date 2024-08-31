import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *
 *
 */

public class IceCreamParlor {

    private static List<Integer> icecreamParlor ( int m, List <Integer> arr ) {

        Map <Integer, Integer> map = new HashMap <>();

        for(int  i = 0; i < arr.size(); i++){
            int complement = m - arr.get(i);
            if(map.containsKey(complement)){
                return List.of(map.get(complement) + 1, i  +1);
            }
            map.put(arr.get(i),i);
        }
        return List.of();
    }

    public static void main ( String[] args ) {
        // Example usage
        int t = 2;

        List<List<Integer>> costs = List.of(
                List.of(1,4,5,3,2),
                List.of(2,2,4,3)
        );

        int[] money = {4, 4};

        for (int i = 0; i < t; i++) {
            List<Integer> result = icecreamParlor(money[i], costs.get(i));
            System.out.println(result.get(0) + " " + result.get(1));
        }
    }


}
