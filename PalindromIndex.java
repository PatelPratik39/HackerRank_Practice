
/**
 *  Palindrom Index problem
 *  The "Palindrome Index" problem is a classic coding problem where you are given a string, and you need to determine the index of the character that,
 *  when removed, would make the string a palindrome. If the string is already a palindrome, or if no such index exists, you should return -1.
 *
 * Problem Explanation:
 * A palindrome is a string that reads the same forward and backward, e.g., "madam", "racecar".
 * Your task is to find the index of a character which, when removed, would make the string a palindrome.
 * If the string is already a palindrome, or if removing one character cannot make it a palindrome, return -1.
 * Example:
 * Input: "aaab"
 *
 * Output: 3 (Removing the character at index 3 ('b') results in the palindrome "aaa".)
 *
 * Input: "baa"
 *
 * Output: 0 (Removing the character at index 0 ('b') results in the palindrome "aa".)
 *
 * Input: "abc"
 *
 * Output: -1 (No single character removal can make "abc" a palindrome.)
 *
 */

public class PalindromIndex {

    private static int palindromeIndex ( String s ) {
        int left = 0;
        int right = s.length() -1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                if(isPalindrome(s,left + 1,right)){
                    return left;
                }
                if(isPalindrome(s, left, right-1)){
                    return right;
                }
                return - 1; // if removal of character does not work then return -1
            }
            left++;
            right--;
        }
        return -1; // if string is already palindrome

    }

    private static boolean isPalindrome ( String s, int left, int right ) {
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main ( String[] args ) {
        System.out.println(palindromeIndex("aaab")); // Output: 3
        System.out.println(palindromeIndex("baa"));  // Output: 0
        System.out.println(palindromeIndex("abc"));  // Output: -1
        System.out.println(palindromeIndex("racecar")); // Output: -1
        System.out.println(palindromeIndex("madam"));
    }


}
