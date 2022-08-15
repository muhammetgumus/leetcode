package src;

import src.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q94_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode tr3 = new TreeNode(3, null, null);
        TreeNode tr2 = new TreeNode(2, tr3, null);
        TreeNode tr1 = new TreeNode(1, null, tr2);
        inorderTraversal(tr1);
    }

    static List<Integer> results = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        if (root.left == null && root.right == null) {
            results.add(root.val);
            return results;
        }
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        results.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right);
        }

        return results;
    }
}
