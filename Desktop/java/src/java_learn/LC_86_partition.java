package java_learn;

public class LC_86_partition {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode partition(ListNode head, int x) {
        /*ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode x_position = head;
        while (x_position.val != x){
            x_position = x_position.next;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre.next;*/
        /*boolean flag_pass_x = false;
        while (temp != null){




            temp = temp.next;
            pre.next = pre.next.next;
        }*/
        //Stack<ListNode> stack = new Stack<>();

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode min = new ListNode(0);
        ListNode min_t = min;


        ListNode curr = dummy;

        while (curr.next != null){
            if (curr.next.val < x){
                min_t.next = curr.next;
                min_t = min_t.next;
                curr.next = curr.next.next;
                continue;
            }

            curr = curr.next;
        }

        min_t.next = dummy.next;



        return min.next;
    }
}
