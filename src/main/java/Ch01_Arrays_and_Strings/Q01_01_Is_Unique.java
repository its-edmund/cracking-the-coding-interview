package Ch01_Arrays_and_Strings;

import java.util.*;

public class Q01_01_Is_Unique {
    public static boolean isUnique(String s) {
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!chars.contains(s.charAt(i))) {
                chars.add(s.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
