package java_learn;
/*
给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

说明: 叶子节点是指没有子节点的节点。

示例：
给定二叉树 [3,9,20,null,null,15,7]，

    3
   / \
  9  20
    /  \
   15   7

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LC_104_maxDepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int max = 0;

    public int maxDepth(TreeNode root) {
        if (root == null){
            return max;
        }

        dfs(root, 1);

        return max;
    }

    public void dfs(TreeNode curr, int curr_depth){
        max = Math.max(curr_depth, max);
        if (curr.left != null){
            dfs(curr.left, curr_depth + 1);
        }
        if (curr.right != null){
            dfs(curr.right, curr_depth + 1);
        }
    }

}
