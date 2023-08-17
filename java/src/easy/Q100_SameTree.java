package src.easy;

import src.common.TreeNode;

public class Q100_SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(5);
        TreeNode pLeft = new TreeNode(1);
        TreeNode pRight = new TreeNode(3);
        p.left = pLeft;
        p.right = pRight;

        TreeNode q = new TreeNode(5);
        TreeNode qLeft = new TreeNode(1);
        TreeNode qRight = new TreeNode(3);
        q.left = pLeft;
        q.right = pRight;

        System.out.println("Are trees same ? : " + isSameTree(p, q));

        TreeNode a = new TreeNode(4);
        TreeNode aLeft = new TreeNode(1);
        TreeNode aRight = new TreeNode(2);
        a.left = aLeft;
        a.right = aRight;

        TreeNode b = new TreeNode(4);
        TreeNode bLeft = new TreeNode(1);
        TreeNode bRight = null;

        b.left = bLeft;
        b.right = bRight;

        System.out.println("Are trees same ? : " + isSameTree(a, b));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isSame = true;
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


}
