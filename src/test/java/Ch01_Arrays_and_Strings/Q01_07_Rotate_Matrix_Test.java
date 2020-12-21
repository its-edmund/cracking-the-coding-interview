package Ch01_Arrays_and_Strings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Q01_07_Rotate_Matrix_Test {

    private Q01_07_Rotate_Matrix s = new Q01_07_Rotate_Matrix();

    @Test
    public void withOneOne() {
        assertTrue(Arrays.deepEquals(new int[][]{{1}}, s.rotate(new int[][]{{1}})));
    }

    @Test
    public void withTwoTwo() {
        assertTrue(Arrays.deepEquals(new int[][]{
                        {3, 1},
                        {4, 2}},
                s.rotate(new int[][]{
                        {1, 2},
                        {3, 4}})));
    }

    @Test
    public void withThreeThree() {
        assertTrue(Arrays.deepEquals(new int[][]{
                        {7, 4, 1},
                        {8, 5, 2},
                        {9, 6, 3}
                },
                s.rotate(new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}})));
    }
}