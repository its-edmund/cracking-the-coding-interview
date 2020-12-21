package Ch01_Arrays_and_Strings;

public class Q01_06_String_Compression {
    /*
     * public static String strComp(String str) { String ans = ""; char currChar =
     * str.charAt(0); int count = 0; for (char c : str.toCharArray()) { if (c !=
     * currChar) { ans += currChar + Integer.toString(count); currChar = c; count =
     * 1; } else { count++; } } ans += currChar + Integer.toString(count); // Forgot
     * to check for length // return ans; return ans.length() < str.length() ? ans :
     * str; }
     */

    // TODO: USE STRINGBUILDER

    public String compress(String str) {
        String ans = "";
        char currChar = str.charAt(0);
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c != currChar) {
                ans += Integer.toString(count) + currChar;
                currChar = c;
                count = 1;
            } else {
                count++;
            }
        }
        ans += Integer.toString(count) + currChar;
        // Forgot to check for length
        // return ans;
        return ans.length() < str.length() ? ans : str;
    }
}
