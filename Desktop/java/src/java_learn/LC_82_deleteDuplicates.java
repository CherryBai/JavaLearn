package java_learn;

public class LC_82_deleteDuplicates {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        while (cur.next != null){
            if (cur.val == cur.next.val){
                ListNode temp = cur.next;
                while (temp.next != null && temp.next.val == cur.val){
                    temp = temp.next;
                }
                cur.next = temp.next;

            }
            else {
                cur = cur.next;
            }

        }

        return dummy.next;
    }

}
