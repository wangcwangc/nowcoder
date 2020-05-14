package 剑指offer;

import java.util.LinkedList;
import java.util.Queue;

public class 序列化二叉树 {
    String Serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        if (root != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode treeNode = queue.poll();
                if (treeNode != null) {
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                    stringBuilder.append(treeNode.val);
                    stringBuilder.append(",");
                } else {
                    stringBuilder.append("#,");
                }
            }
        }
        return stringBuilder.toString();
    }

    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) return null;
        String[] nodes = str.split(",");
        TreeNode[] treeNodes = new TreeNode[nodes.length];
        for (int i = 0; i < nodes.length; i++) {
            if (!nodes[i].equals("#")) {
                treeNodes[i] = new TreeNode(Integer.valueOf(nodes[i]));
            }
        }
        for (int i = 0, j = 1; i < treeNodes.length; i++) {
            if (treeNodes[i] != null) {
                treeNodes[i].left = treeNodes[j++];
                treeNodes[i].right = treeNodes[j++];
            }
        }
        return treeNodes[0];
    }
}
