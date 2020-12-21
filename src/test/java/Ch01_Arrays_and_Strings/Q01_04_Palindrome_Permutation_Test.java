package Ch01_Arrays_and_Strings;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Q01_04_Palindrome_Permutation_Test {

    private Q01_04_Palindrome_Permutation s = new Q01_04_Palindrome_Permutation();

    @Test
    public void withEmpty() {
        assertTrue(s.check(""));
    }

    @Test
    public void withOneChar() {
        assertTrue(s.check("a"));
    }

    @Test
    public void withTwoWords_OddLetters() {
        assertTrue(s.check("acto tac"));
    }

    @Test
    public void withTwoWords_OddLetters_ThreeOccurences() {
        assertTrue(s.check("act atac"));
    }

    @Test
    public void withTwoWords_EvenLetters() {
        assertTrue(s.check("act cat"));
    }
}