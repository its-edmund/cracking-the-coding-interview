package Ch01_Arrays_and_Strings;

public class Q01_07_Rotate_Matrix {
    public int[][] rotate(int[][] in) {
        int[][] ans = new int[in.length][in.length];
        for(int i = 0; i < in.length; i++) {
            for(int j = 0; j < in[i].length; j++) {
                ans[j][in.length - i - 1] = in[i][j]; 
            }
        }
        return ans;
    }
}
