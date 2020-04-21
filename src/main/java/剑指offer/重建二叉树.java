package 剑指offer;

public class 重建二叉树 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = new TreeNode(pre[0]);
        int subLength = 0;
        int j = 0;
        for (j = 0; j < in.length; j++) {
            if (in[j] == pre[0]) break;
            else {
                subLength++;
            }
        }
        if (subLength > 0) {
            int[] preLeft = new int[subLength];
            int[] inLeft = new int[subLength];
            for (int i = 0; i < subLength; i++) {
                preLeft[i] = pre[i + 1];
                inLeft[i] = in[i];
            }
            root.left = reConstructBinaryTree(preLeft, inLeft);
        }
        if ((in.length - subLength - 1) > 0) {
            subLength = in.length - subLength - 1;
            int[] preRigth = new int[subLength];
            int[] inRight = new int[subLength];
            for (int i = 0; i < subLength; i++) {
                preRigth[i] = pre[i + j + 1];
                inRight[i] = in[i + j + 1];
            }
            root.right = reConstructBinaryTree(preRigth, inRight);
        }
        return root;
    }
}
