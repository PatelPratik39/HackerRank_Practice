import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 *
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 *
 * Constraints
 *
 *  will consist at most  lower case english letters.
 * Sample Input
 *
 * madam
 * Sample Output
 *
 * Yes
 */
public class PalindromeCheck {

    private static boolean isPalindrom ( String str ) {

        //two pointer approach
//        for(int i = 0; i< str.length() / 2; i++){
//            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
//                return false;
//            }
//        }
//        return true;

        String newStr = new StringBuilder(str).reverse().toString();
        return str.equals(newStr);
    }
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = scanner.next();

//        StringBuilder newStr = new StringBuilder();
        if(isPalindrom(str)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        scanner.close();
    }


}
