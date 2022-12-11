// I have the given solution for this one, mine makes more sense I swear so not including it here
public class BalancedBinaryTree {
    boolean balance = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return balance;
        }
        int left = depth(root.left);
        int right = depth(root.right);

        if (Math.abs(left-right) > 1) {
            balance = false;
        }

        isBalanced(root.left);
        isBalanced(root.right);

        return balance;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(1 + depth(root.left), 1 + depth(root.right));
    }
}
