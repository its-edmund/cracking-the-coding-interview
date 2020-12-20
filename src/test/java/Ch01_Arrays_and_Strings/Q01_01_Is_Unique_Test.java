package Ch01_Arrays_and_Strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q01_01_Is_Unique_Test {

    private Q01_01_Is_Unique s = new Q01_01_Is_Unique();

    @Test
    public void withEmptyString() {
        assertTrue(s.isUnique(""));
    }

    @Test
    public void withUniqueString() {
        assertTrue(s.isUnique("abcde"));
    }

    @Test
    public void withDuplication() {
        assertFalse(s.isUnique("abcda"));
    }

}