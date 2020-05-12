package 剑指offer;

public class 二叉树的深度 {
    //递归
    public int TreeDepth(TreeNode root) {
        if (root != null) {
            return TreeDepth(root.left) + 1 > TreeDepth(root.right) + 1 ? TreeDepth(root.left) + 1 : TreeDepth(root.right) + 1;
        }
        return 0;
    }
}
