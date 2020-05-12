package 剑指offer;

public class 平衡二叉树 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return depth(root) != -1;
    }

    private int depth(TreeNode treeNode) {
        if (treeNode == null) return 0;
        int left = depth(treeNode.left);
        int right = depth(treeNode.right);
        if (left == -1 || right == -1) return -1;
        return Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;
    }
}
