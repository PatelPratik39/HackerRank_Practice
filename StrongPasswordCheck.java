import java.util.Map;
import java.util.Scanner;

/***
 * The website considers a password to be strong if it satisfies the following criteria:
 *
 * Its length is at least .
 * It contains at least one digit.
 * It contains at least one lowercase English character.
 * It contains at least one uppercase English character.
 * It contains at least one special character. The special characters are: !@#$%^&*()-+
 *
 * Note: Here's the set of types of characters in a form you can paste in your solution:
 *
 * numbers = "0123456789"
 * lower_case = "abcdefghijklmnopqrstuvwxyz"
 * upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 * special_characters = "!@#$%^&*()-+"
 * Example
 *
 *
 * This password is 5 characters long and is missing an uppercase and a special character. The minimum number of characters to add is .
 *
 *
 * This password is 5 characters long and has at least one of each character type. The minimum number of characters to add is .
 *
 * Function Description
 *
 * Complete the minimumNumber function in the editor below.
 *
 * minimumNumber has the following parameters:
 *
 * int n: the length of the password
 * string password: the password to test
 * Returns
 *
 * int: the minimum number of characters to add
 *
 *
 */
public class StrongPasswordCheck {

    private static int minNumber ( int n, String password ) {
        // Define character types
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUper = false;
        boolean hasSpecial = false;

//        lets check types are present
        for(int i = 0; i < n; i++) {
            char c = password.charAt(i);
            if (numbers.indexOf(c) >= 0) hasDigit = true;
            if (lower_case.indexOf(c) >= 0) hasLower = true;
            if (upper_case.indexOf(c) >= 0) hasUper = true;
            if (special_characters.indexOf(c) >= 0) hasSpecial = true;

        }
//            now count the number of missing types
            int missingRequirment = 0;
            if(!hasDigit) missingRequirment++;
            if(!hasLower) missingRequirment++;
            if(!hasUper) missingRequirment++;
            if(!hasSpecial) missingRequirment++;

//            now check the length of the password
            int lengthPassword = Math.max(0, 6-n);

//            return all the missing types
            return Math.max(missingRequirment, lengthPassword);

    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password : ");
        String password = scanner.nextLine();

        int n = password.length();

        int result = minNumber(n,password);
        System.out.println(result);
        scanner.close();
    }


}
