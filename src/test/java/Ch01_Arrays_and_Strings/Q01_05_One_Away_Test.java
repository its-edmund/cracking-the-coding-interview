package Ch01_Arrays_and_Strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q01_05_One_Away_Test {

    private Q01_05_One_Away s = new Q01_05_One_Away();

    @Test
    public void withEmpty() {
        assertTrue(s.isOneAway("", ""));
    }

    @Test
    public void withOneEmpty() {
        System.out.println(s.isOneAway("", "b"));
        assertTrue(s.isOneAway("", "b"));
    }

    @Test
    public void withTwoSingleWords() {
        assertTrue(s.isOneAway("a", "b"));
    }

    @Test
    public void withOneInsertion() {
        System.out.println(s.isOneAway("pae", "pale"));
        assertTrue(s.isOneAway("pae", "pale"));
    }

    @Test
    public void withOneDeletion() {
        assertTrue(s.isOneAway("pales", "paes"));
    }

    @Test
    public void withOneReplace() {
        assertTrue(s.isOneAway("pawe", "pave"));
    }

    @Test
    public void withMoreEdits() {
        assertFalse(s.isOneAway("paxye", "pamne"));
    }
}