package 剑指offer;

import java.util.Stack;

public class 对称的二叉树 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot.left);
        stack.push(pRoot.right);
        while (!stack.empty()) {
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if (right == null && left == null) continue;
            if (right == null || left == null) return false;
            if (right.val != left.val) return false;
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }
        return true;
    }
}
