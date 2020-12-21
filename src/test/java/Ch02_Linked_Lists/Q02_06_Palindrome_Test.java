package Ch02_Linked_Lists;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q02_06_Palindrome_Test {

    private Q02_06_Palindrome s = new Q02_06_Palindrome();

    @Test
    public void withEmptyList() {
        assertTrue(s.isPalindrome(LinkedListNode.empty()));
    }

    @Test
    public void withOneElement() {
        assertTrue(s.isPalindrome(LinkedListNode.of(1)));
    }

    @Test
    public void withThreeElements() {
        assertTrue(s.isPalindrome(LinkedListNode.of(1, 2, 1)));
    }

    @Test
    public void withFourElements() {
        assertTrue(s.isPalindrome(LinkedListNode.of(1, 2, 2, 1)));
    }

    @Test
    public void withFourElements_NotPalindrome() {
        assertFalse(s.isPalindrome(LinkedListNode.of(1, 2, 2, 3)));
    }
}