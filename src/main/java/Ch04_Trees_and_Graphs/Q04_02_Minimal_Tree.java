package Ch04_Trees_and_Graphs;

import java.util.Arrays;

public class Q04_02_Minimal_Tree {
    BinaryTreeNode buildMinimalTree(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        int middle = (nums.length - 1) / 2;
        BinaryTreeNode root = new BinaryTreeNode(nums[middle]);
        root.left = buildMinimalTree(Arrays.copyOfRange(nums, 0, middle));
        root.right = buildMinimalTree(Arrays.copyOfRange(nums, middle + 1, nums.length));
        return root;
    }
}
