package 剑指offer;

public class 链表中倒数第K个结点 {
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode p = null;
        ListNode pre = null;
        p = head;
        pre = head;
        int num = k;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
            if (k < 1) {
                pre = pre.next;
            }
            k--;
        }
        if (count < num) return null;
        return pre;
    }
}
