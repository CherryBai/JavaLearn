package sword_to_offer;

import java.util.Stack;

/*
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。



示例 1：

输入：head = [1,3,2]
输出：[2,3,1]
 */
public class offer_06_reversePrint {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int len = 0;
        while (head != null){
            len ++;
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = stack.pop();
        }

        return res;
    }


}
