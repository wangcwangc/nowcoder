package 剑指offer;

public class 二叉树的下一个结点 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        while (pNode.next != null) {
            TreeLinkNode root = pNode.next;
            if (root.left == pNode) {
                return root;
            }
            pNode = pNode.next;
        }
        return null;
    }
}
