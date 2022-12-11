public class SameTree {
    boolean isSame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return isSame;
        } else if (p == null && q != null) {
            isSame = false;
            return isSame;
        } else if (p != null && q == null) {
            isSame = false;
            return isSame;
        }

        if (p.val != q.val) {
            isSame = false;
        }

        isSameTree(p.left, q.left);
        isSameTree(p.right, q.right);

        return isSame;
    }

    //Damn clever!
    private boolean dfsSolution(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) return false;

        boolean left = dfsSolution(p.left, q.left);
        boolean right = dfsSolution(p.right, q.right);

        return left && right;
    }
}
