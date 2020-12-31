package Ch08_Recursion_and_Dynamic_Programming;

import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class Q08_02_Robot_in_a_Grid_Test {


    private Q08_02_Robot_in_a_Grid s = new Q08_02_Robot_in_a_Grid();

    @Test
    public void withAllFeasibleCells() {
        boolean[][] grid = new boolean[][]{
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        assertEquals(Arrays.asList(
                new Point(0, 0), new Point(0, 1),
                new Point(0, 2), new Point(1, 2),
                new Point(2, 2)), s.findPath(grid));
    }

    @Test
    public void withSomeBrokenCells() {
        boolean[][] grid = new boolean[][]{
                {true, true, true},
                {true, true, false},
                {false, true, true}
        };

        assertEquals(Arrays.asList(
                new Point(0, 0), new Point(0, 1),
                new Point(1, 1), new Point(2, 1),
                new Point(2, 2)), s.findPath(grid));
    }

    @Test
    public void withNoPath() {
        boolean[][] grid = new boolean[][]{
                {true, true, true},
                {true, true, false},
                {false, false, true}
        };

        assertEquals(Collections.emptyList(), s.findPath(grid));
    }


}