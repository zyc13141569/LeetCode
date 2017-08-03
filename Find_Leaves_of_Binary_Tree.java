import java.util.ArrayList;
import java.util.List;

/**
 * Created by MH on 8/3/2017.
 * Given a binary tree, collect a tree's nodes as if you were doing this: Collect and remove all leaves, repeat until the tree is empty.

 Example:
 Given binary tree
        1
       / \
      2   3
    /  \
   4    5
 Returns [4, 5, 3], [2], [1].

 Explanation:
 1. Removing the leaves [4, 5, 3] would result in this tree:
    1
   /
 2
 2. Now removing the leaf [2] would result in this tree:
   1

 3. Now removing the leaf [1] would result in the empty tree:
 []
 Returns [4, 5, 3], [2], [1].
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){ val = x;}
}
public class Find_Leaves_of_Binary_Tree {
    private int find(TreeNode node, List<List<Integer>> results) {
        if (node == null) return 0;
        int depth = Math.max(find(node.left, results), find(node.right, results));
        if (depth == results.size()) results.add(new ArrayList<>());
        results.get(depth).add(node.val);
        return depth + 1;
    }
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root != null) find(root, results);
        return results;
    }
}
