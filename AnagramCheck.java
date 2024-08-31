import java.util.Arrays;
import java.util.Scanner;

/**
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 *
 * Function Description
 *
 * Complete the isAnagram function in the editor.
 *
 * isAnagram has the following parameters:
 *
 * string a: the first string
 * string b: the second string
 * Returns
 *
 * boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
 * Input Format
 *
 * The first line contains a string .
 * The second line contains a string .
 *
 * Constraints
 *
 * Strings  and  consist of English alphabetic characters.
 * The comparison should NOT be case sensitive.
 * Sample Input 0
 *
 * anagram
 * margana
 * Sample Output 0
 *
 * Anagrams
 */

public class AnagramCheck {

    private static boolean isAnagram ( String str1, String str2 ) {

//        base case
        if(str1.length() != str2.length()){
            return false;
        }
//        frequency check of the strings
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        for(int i = 0; i < str1.length(); i++){
            frequency1[str1.charAt(i) - 'a']++;
            frequency2[str2.charAt(i) - 'a']++;
        }
        return Arrays.equals(frequency1,frequency2);

    }
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().trim().toLowerCase();
        String str2 = scanner.nextLine().trim().toLowerCase();

//        check Anangrams
        if(isAnagram(str1, str2)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }


}
