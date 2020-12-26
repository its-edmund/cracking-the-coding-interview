package Ch04_Trees_and_Graphs;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q04_04_Check_Balanced_Test {

    private Q04_04_Check_Balanced s = new Q04_04_Check_Balanced();

    @Test
    public void withOneNode() {
        assertTrue(s.isBalanced(new BinaryTreeNode(1)));
    }

    @Test
    public void withTwoNodes() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        assertTrue(s.isBalanced(root));
    }

    @Test
    public void withThreeNodes() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        assertTrue(s.isBalanced(root));
    }

    @Test
    public void withFourNodes_Unbalanced() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.left.left = new BinaryTreeNode(3);
        assertFalse(s.isBalanced(root));
    }

    @Test
    public void withSameHeight_Unbalanced() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.left.left = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(7);
        root.left.left.left = new BinaryTreeNode(6);
        root.left.left.left.left = new BinaryTreeNode(8);
        root.right = new BinaryTreeNode(4);
        root.right.right = new BinaryTreeNode(5);
        root.right.right.right = new BinaryTreeNode(9);
        assertFalse(s.isBalanced(root));
    }
}