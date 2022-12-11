
// Didnt realise could do 2 different functions so ended up copying, but this is a good learning one just need to do it agaqin sometime
public class DiameterofBinaryTree {
    int result = -1;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

    public int dfs(TreeNode current) {
        if (current == null) {
            return -1;
        }
        int left = 1 + dfs(current.left);
        int right = 1 + dfs(current.right);
        result = Math.max(result, (left+right));
        return Math.max(left,right);
    }
}
