package java_learn;


public class LC_92_reverseBetween {
/*
反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。

说明:
1 ≤ m ≤ n ≤ 链表长度。

示例:

输入: 1->2->3->4->5->NULL, m = 2, n = 4
输出: 1->4->3->2->5->NULL

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }


    public ListNode reverseBetween(ListNode head, int m, int n) {
            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;

            ListNode g = dummyHead;
            ListNode p = dummyHead.next;

            int step = 0;
            while (step < m - 1) {
                g = g.next;
                p = p.next;
                step ++;
            }

            for (int i = 0; i < n - m; i++) {
                ListNode removed = p.next;
                p.next = p.next.next;

                removed.next = g.next;
                g.next = removed;
            }

            return dummyHead.next;
    }



}
