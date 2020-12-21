package Ch01_Arrays_and_Strings;

public class Q01_03_URLify {
    public char[] urlify(char[] url, int len) {
        int spaces = 0;
        for(char c : url) {
            if(c == ' ') {
                spaces++;
            }
        }
        if(spaces / 3.0 != (url.length - len) / 2.0) { 
            throw new IllegalArgumentException();
        }
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
                return url;
            }
            start--;
        }
        return url;
    }
}
