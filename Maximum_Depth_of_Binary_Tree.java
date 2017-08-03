/**
 * Created by MH on 8/3/2017.
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


 */
public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left == null) return maxDepth(root.right)+1;
        if(root.right == null) return maxDepth(root.left)+1;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
