package java_learn;
/*
给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。

示例 1:

输入: 1->2->3->4->5->NULL, k = 2
输出: 4->5->1->2->3->NULL
解释:
向右旋转 1 步: 5->1->2->3->4->NULL
向右旋转 2 步: 4->5->1->2->3->NULL
示例 2:

输入: 0->1->2->NULL, k = 4
输出: 2->0->1->NULL
解释:
向右旋转 1 步: 2->0->1->NULL
向右旋转 2 步: 1->2->0->NULL
向右旋转 3 步: 0->1->2->NULL
向右旋转 4 步: 2->0->1->NULL

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/rotate-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class LC_61_rotateRight {
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode dummy =new ListNode(0);
        if(head == null ) return dummy.next;
        if(head.next == null) return head;

        dummy.next = head;
        //find tail
        ListNode temp = head;
        int len = 0;
        while (temp.next != null){
            temp = temp.next;
            len ++;
        }
        temp = head;

        k = k % len;
        while (k != 0){
            ListNode temp_pre = temp;
            while (temp.next != null){
                temp_pre = temp;
                temp = temp.next;
            }
            temp_pre.next = null;
            dummy.next = temp;
            temp.next = head;
            head = dummy.next;


            k --;
        }

        return dummy.next;
    }
}
