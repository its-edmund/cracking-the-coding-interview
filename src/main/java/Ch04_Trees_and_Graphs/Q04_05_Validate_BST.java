package Ch04_Trees_and_Graphs;

public class Q04_05_Validate_BST {
    public boolean isBST(BinaryTreeNode root) {
        if(root == null) {
            return true;
        }
        if(!allLessThan(root.left, root.val) || !allGreaterThan(root.right, root.val)) {
            return false;
        }
        return isBST(root.left) && isBST(root.right);
    }

    public boolean allLessThan(BinaryTreeNode root, int num) {
        if(root == null) {
            return true;
        }
        if(root.val >= num) {
            return false;
        }
        return allLessThan(root.left, num) && allLessThan(root.right, num);
    }

    public boolean allGreaterThan(BinaryTreeNode root, int num) {
        if(root == null) {
            return true;
        }
        if(root.val <= num) {
            return false;
        }
        return allGreaterThan(root.left, num) && allGreaterThan(root.right, num);
    }
}
