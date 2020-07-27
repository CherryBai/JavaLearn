package sword_to_offer;
/*
输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

 

例如，给出

前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.HashMap;

public class offer_07_buildTree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

      HashMap<Integer, Integer> map = new HashMap<>();
      int[] po;

      public TreeNode buildTree(int[] preorder, int[] inorder){
          po = preorder;
          for (int i = 0; i < preorder.length; i++) {
              map.put(inorder[i], i);
          }
          return recur(0, 0, preorder.length - 1);

      }

      TreeNode recur(int pre_root, int in_left, int in_right){
          if (in_left > in_right) return null;
          TreeNode root = new TreeNode(po[pre_root]);
          int i = map.get(po[pre_root]);
          root.left = recur(pre_root + 1, in_left, i - 1);
          root.right = recur(pre_root + i - in_left + 1, i + 1, in_right);
          return root;
      }



}
