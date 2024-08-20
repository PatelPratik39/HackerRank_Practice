

public class Lexicographical {

    public static void main ( String[] args ) {
        String A = "hello";
        String B = "world";

        int lengthOfStrings = A.length() + B.length();
        System.out.println(lengthOfStrings);

        if(A.compareTo(B) > 0 ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String strA = A.substring(0,1).toUpperCase() + A.substring(1);
        String strB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
        System.out.println(strA + " " + strB);
    }
}
