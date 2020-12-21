package Ch01_Arrays_and_Strings;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Q01_03_URLify_Test {

    private Q01_03_URLify s = new Q01_03_URLify();

    @Test
    public void withNoSpace() {
        assertArrayEquals("hello".toCharArray(), s.urlify("hello".toCharArray(), 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void withInsufficientLength() {
        s.urlify("hello world ".toCharArray(), 11);
    }

    @Test
    public void withOneSpace() {
        assertArrayEquals("hello%20world".toCharArray(), s.urlify("hello world  ".toCharArray(), 11));
    }

    @Test
    public void withTwoSpaces() {
        assertArrayEquals("hello%20world%20bob".toCharArray(), s.urlify("hello world bob    ".toCharArray(), 15));
    }
}