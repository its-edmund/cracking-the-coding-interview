package Ch04_Trees_and_Graphs;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Q04_03_List_of_Depths_Test {

    private Q04_03_List_of_Depths s = new Q04_03_List_of_Depths();

    @Test
    public void withOneElement() {
        List<LinkedList<Integer>> linkedLists = s.create(new BinaryTreeNode(1));
        List<LinkedList<Integer>> results = new ArrayList<>();
        results.add(new LinkedList<>(Collections.singletonList(1)));
        assertEquals(results, linkedLists);
    }

    @Test
    public void withTwoElements() {
        BinaryTreeNode node = new BinaryTreeNode(1);
        node.left = new BinaryTreeNode(2);
        List<LinkedList<Integer>> linkedLists = s.create(node);
        List<LinkedList<Integer>> results = new ArrayList<>();
        results.add(new LinkedList<>(Collections.singletonList(1)));
        results.add(new LinkedList<>(Collections.singletonList(2)));
        assertEquals(results, linkedLists);
    }

    @Test
    public void withThreeElements() {
        BinaryTreeNode node = new BinaryTreeNode(1);
        node.left = new BinaryTreeNode(2);
        node.right = new BinaryTreeNode(3);
        List<LinkedList<Integer>> linkedLists = s.create(node);
        List<LinkedList<Integer>> results = new ArrayList<>();
        results.add(new LinkedList<>(Collections.singletonList(1)));
        results.add(new LinkedList<>(Arrays.asList(2, 3)));
        assertEquals(results, linkedLists);
    }
}