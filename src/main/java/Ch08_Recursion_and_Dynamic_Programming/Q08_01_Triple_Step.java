package Ch08_Recursion_and_Dynamic_Programming;

public class Q08_01_Triple_Step {
    public int countWays(int n) {
        if(n == 0) {
            return 1;
        } else if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        } else if(n == 3) {
            return 4;
        }
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }
}