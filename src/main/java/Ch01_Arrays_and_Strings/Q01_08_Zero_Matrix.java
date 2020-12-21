package Ch01_Arrays_and_Strings;

public class Q01_08_Zero_Matrix {
    public int[][] zero(int[][] in) {
        int[][] zeros = new int[in.length][in.length != 0 ? in[0].length : 0];
        for(int i = 0; i < in.length; i++) {
            for(int j = 0; j < in[i].length; j++) {
                zeros[i][j] = in[i][j] == 0 ? 1 : 0;
            }
        }
        for(int i = 0; i < in.length; i++) {
            for(int j = 0; j < in[i].length; j++) {
                if(zeros[i][j] == 1) {
                    for(int k = 0; k < in.length; k++) {
                        in[k][j] = 0;
                    }
                    for(int k = 0; k < in[i].length; k++) {
                        in[i][k] = 0;
                    }
                }
            }
        }
        return in;
    }
}
