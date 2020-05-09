package 剑指offer;

import java.util.Stack;

public class 二叉搜索树与双向链表 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = pRootOfTree;
        TreeNode pre = null;
        boolean first = true;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (first) {
                pRootOfTree = p;
                pre = pRootOfTree;
                first = false;

            } else {
                pre.right = p;
                p.left = pre;
                pre = p;
            }
            p = p.right;
        }
        return pRootOfTree;
    }
}
