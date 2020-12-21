package Ch01_Arrays_and_Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q01_06_String_Compression_Test {

    private Q01_06_String_Compression s = new Q01_06_String_Compression();

    @Test
    public void withOneSingleChar() {
        assertEquals("a", s.compress("a"));
    }

    @Test
    public void withTwoChars() {
        assertEquals("aa", s.compress("aa"));
    }

    @Test
    public void withThreeChars() {
        assertEquals("3a", s.compress("aaa"));
    }

    @Test
    public void withDifferentChars() {
        assertEquals("aaab", s.compress("aaab"));
    }

    @Test
    public void withDifferentChars_RepeatingSeveralTimes() {
        assertEquals("3a2b", s.compress("aaabb"));
    }

    @Test
    public void withDifferentChars_RepeatingInMoreSeqs() {
        assertEquals("3a2b2a", s.compress("aaabbaa"));
    }

}