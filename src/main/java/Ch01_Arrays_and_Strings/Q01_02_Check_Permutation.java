package Ch01_Arrays_and_Strings;

import java.util.*;

public class Q01_02_Check_Permutation {
    public static boolean check(String str1, String str2) {
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            freq1.put(str1.charAt(i), freq1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            freq2.put(str2.charAt(i), freq2.getOrDefault(str2.charAt(i), 0) + 1);
        }
        for (char key : freq1.keySet()) {
            if (freq1.get(key) != freq2.getOrDefault(key, 0)) {
                return false;
            }
        }
        return true;
    }
}
