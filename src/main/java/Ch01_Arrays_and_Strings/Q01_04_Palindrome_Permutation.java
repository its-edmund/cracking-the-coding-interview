package Ch01_Arrays_and_Strings;

import java.util.*;

public class Q01_04_Palindrome_Permutation {
    public static boolean palPerm(String in) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : in.toCharArray()) {
            if (Character.isLetter(c)) {
                freq.put(Character.toLowerCase(c), freq.getOrDefault(Character.toLowerCase(c), 0) + 1);
            }
        }
        boolean alreadyOdd = false;
        for (int i : freq.values()) {
            if (i % 2 == 1) {
                if (alreadyOdd) {
                    return false;
                } else {
                    alreadyOdd = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palPerm("Tact Coa"));
        System.out.println(palPerm("Tacti Coa"));
    }
}