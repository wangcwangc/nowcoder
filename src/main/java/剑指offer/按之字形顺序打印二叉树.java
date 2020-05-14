package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;

public class 按之字形顺序打印二叉树 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot != null) {
            LinkedList<TreeNode> linkedList = new LinkedList<>();
            linkedList.add(pRoot);
            boolean flag = true;
            int size = linkedList.size();
            while (!linkedList.isEmpty()) {
                ArrayList<Integer> list = new ArrayList<>();
                while (size > 0) {
                    size--;
                    if (flag) {
                        TreeNode treeNode = linkedList.pollFirst();
                        if (treeNode != null) {
                            if (treeNode.left != null) linkedList.addLast(treeNode.left);
                            if (treeNode.right != null) linkedList.addLast(treeNode.right);
                            list.add(treeNode.val);
                        }
                    } else {
                        TreeNode treeNode = linkedList.pollLast();
                        if (treeNode != null) {
                            if (treeNode.right != null) linkedList.addFirst(treeNode.right);
                            if (treeNode.left != null) linkedList.addFirst(treeNode.left);
                            list.add(treeNode.val);
                        }
                    }
                }
                size = linkedList.size();
                if (list.size() > 0) {
                    result.add(list);
                }
                flag = !flag;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        按之字形顺序打印二叉树 a = new 按之字形顺序打印二叉树();
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);
        System.out.println(a.Print(root));
    }
}
