/**
 * str  = oneTwoThree
 * ans = 3
 */

public class CamelCase {
    private static int countCamalCaseString ( String str ) {

//        int count = 1; // we have at least 1 word
//        for(int i = 0; i < str.length(); i++){
//            if(Character.isUpperCase(str.charAt(i))){
//                count++;
//            }
//        }
//        return count;

        //using java8 stream()

//        long count = str.chars().filter(Character :: isUpperCase).count();
//        return (int) count + 1;

        int count = 1;
        for(char c :  str.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                count++;
            }
        }
        return count;
    }

    public static void main ( String[] args ) {
        String str = "oneTwoThree";
        System.out.println(countCamalCaseString(str));
    }


}
