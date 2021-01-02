package Ch08_Recursion_and_Dynamic_Programming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q08_03_Magic_Index_Test {

    private Q08_03_Magic_Index s = new Q08_03_Magic_Index();     

    @Test
    public void withOneElement() {
        assertEquals(-1, s.findMagicIndex(new int[]{2}));
        assertEquals(0, s.findMagicIndex(new int[]{0}));
    }

    @Test
    public void withMagicIndex() {
        assertEquals(2, s.findMagicIndex(new int[]{-1, 0, 2, 5, 7, 9}));
    }

    @Test
    public void withoutMagicIndex() {
        assertEquals(-1, s.findMagicIndex(new int[]{1, 2, 3, 4, 5, 6}));
    }
}