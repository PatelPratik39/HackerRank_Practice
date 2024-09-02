import java.util.Scanner;

/**
 *  Super Reducing String  => remove duplications from a string
 *
 *   s = "aaabccddd"
 *   ans : "abd"
 *
 */

public class SuperReducingString {

    private static String superReducedString ( String str ) {
//        for(int i = 0; i < str.length() - 1; i++){
//            if(str.charAt(i) == str.charAt(i + 1)){
//                return superReducedString(str.substring(0, i) + str.substring(i+2));
//            }
//        }
//        return str.isEmpty() ? "Empty String" : str;

//        two pointers Approach

        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()){
            int length = result.length();
            if(length > 0 && result.charAt(length -1) == c){
                result.deleteCharAt(length -1);
            }else {
                result.append(c);
            }
        }
        return result.length() == 0 ? "Empty String" : result.toString();
    }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = sc.nextLine();
        String result = superReducedString(str);
        System.out.println(result);
    }


}
