package src;

public class Q101_SymmetricTree {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(2,new TreeNode(3),new TreeNode(4));
        TreeNode n2 = new TreeNode(2,new TreeNode(4),new TreeNode(3));
        TreeNode root = new TreeNode(1,n1,n2);

        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null || checkNodes(root.left, root.right);
    }

    public static boolean checkNodes(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null)
            return true;
        if (n1 == null || n2 == null)
            return false;
        if (n1.val != n2.val) {
            return false;
        }
        return checkNodes(n1.right, n2.left) && checkNodes(n1.left, n2.right);
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
