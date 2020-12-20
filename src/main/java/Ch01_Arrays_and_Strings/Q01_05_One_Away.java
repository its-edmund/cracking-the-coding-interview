package Ch01_Arrays_and_Strings;

public class Q01_05_One_Away {
    public static boolean oneAway(String str1, String str2) {
        if (str1.length() == str2.length()) {
            int changes = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    if (changes > 0) {
                        return false;
                    } else {
                        changes++;
                    }
                }
            }
        } else if (str1.length() - str2.length() == 1) {
            int p1 = 0;
            int p2 = 0;
            while (p1 < str1.length() && p2 < str2.length()) {
                if (str1.charAt(p1) != str2.charAt(p2)) {
                    if (p1 == p2) {
                        if (str1.length() > str2.length()) {
                            p1++;
                        } else {
                            p2++;
                        }
                    } else {
                        return false;
                    }
                } else {
                    p1++;
                    p2++;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bake"));
    }
}
