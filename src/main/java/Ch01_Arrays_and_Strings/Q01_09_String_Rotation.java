package Ch01_Arrays_and_Strings;

public class Q01_09_String_Rotation {
    public boolean isSubstring(String str1, String str2) {
        return str1.contains(str2) || str2.contains(str1);
    }

    public boolean rotated(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        return isSubstring(str1, str2 + str2);
    }
}
