//rotation of characters using given rotation number

public class CeaserCipher {

    private static String ceaserCipher ( String s, int k ) {
        k = k % 26;
        StringBuilder newStr = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                char newChar = (char)('a' + (c - 'a' + k) % 26);
                newStr.append(newChar);
            } else if( c >= 'A' && c <= 'Z'){
                char newChar = (char)('A' + (c-'A' + k) % 26);
                newStr.append(newChar);
            } else {
                newStr.append(c);
            }
        }
        return newStr.toString();

    }

    public static void main ( String[] args ) {
        int n = 10;
            String s = "HelloWorld";
            int k = 3;
            String result = ceaserCipher(s, k);
        System.out.println(result);
    }


}
