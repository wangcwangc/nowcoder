package 剑指offer;

import java.util.ArrayList;

public class 二叉树中和为某一值的路径 {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return result;
        target -= root.val;
        list.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return result;
    }
}
