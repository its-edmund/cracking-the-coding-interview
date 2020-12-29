package Ch04_Trees_and_Graphs;

public class Q04_06_Successor {

    public ParentAwareBinaryTreeNode findInOrderSuccessor(ParentAwareBinaryTreeNode root) {
        if(root == null || (root.right == null && root.parent == null)) {
            return null;
        }
        if(root.right != null) {
            return root.right;
        } else if(root.parent.left == root) {
            return root.parent;
        }
        else {
            root = root.parent;
            if(root.parent == null) {
                return null;
            }
            root = root.parent;
            while(root != null && root.right == null) {
                root = root.parent;
            }
            return root == null ? null : root.right;
        }
    }
}