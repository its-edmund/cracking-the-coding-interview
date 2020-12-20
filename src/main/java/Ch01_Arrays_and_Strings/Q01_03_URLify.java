package Ch01_Arrays_and_Strings;

public class Q01_03_URLify {
    public static void URLify(char[] url, int len) {
        int start = len - 1;
        for (int i = url.length - 1; i > 0; i--) {
            if (start < i) {
                if (url[start] != ' ') {
                    url[i] = url[start];
                } else {
                    url[i] = '0';
                    i--;
                    url[i] = '2';
                    i--;
                    url[i] = '%';
                }
            } else {
                return;
            }
            start--;
        }
    }

    public static void main(String[] args) {
        char[] text = { 'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' ' };
        URLify(text, 13);
        System.out.println(text);
    }
}
