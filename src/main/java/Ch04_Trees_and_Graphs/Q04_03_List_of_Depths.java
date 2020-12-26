package Ch04_Trees_and_Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Q04_03_List_of_Depths {
    List<LinkedList<Integer>> list = new ArrayList<>();
    public List<LinkedList<Integer>> create(BinaryTreeNode root) {
        create(root, 0);
        return list;
    }

    public void create(BinaryTreeNode root, int level) {
        if(root == null) {
            return;
        }
        if(list.size() - 1 < level || list.get(level) == null) {
            LinkedList<Integer> levelList = new LinkedList<>();
            levelList.add(root.val);
            list.add(level, levelList);
        } else {
            list.get(level).add(root.val);
        }
        create(root.left, level + 1);
        create(root.right, level + 1);
    }
}