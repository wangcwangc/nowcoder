package 剑指offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class 把二叉树打印成多行 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot != null) {
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(pRoot);
            int size = queue.size();
            while (!queue.isEmpty()) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                while (size > 0) {
                    TreeNode treeNode = queue.poll();
                    if (treeNode != null) {
                        if (treeNode.left != null) queue.add(treeNode.left);
                        if (treeNode.right != null) queue.add(treeNode.right);
                        arrayList.add(treeNode.val);
                    }
                    size--;
                }
                size = queue.size();
                if (arrayList.size() > 0) {
                    result.add(arrayList);
                }
            }
        }
        return result;
    }
}
