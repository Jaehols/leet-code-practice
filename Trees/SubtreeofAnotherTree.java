public class SubtreeofAnotherTree {

    boolean isSubtree = false;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (sameTree(root, subRoot)) {
            isSubtree = true;
        }
        if (root != null) {
            isSubtree(root.left, subRoot);
            isSubtree(root.right, subRoot);
        }
        return isSubtree;
    }

    private boolean sameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) return false;

        boolean left = sameTree(p.left, q.left);
        boolean right = sameTree(p.right, q.right);

        return left && right;
    }

    // Solution that does not reqquire a global variable, but more code
    public boolean isSubtreeSolution(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (sameTree(root, subRoot)) {
            return true;
        }

        return (
                isSubtreeSolution(root.left, subRoot) || isSubtreeSolution(root.right, subRoot)
        );
    }
}
