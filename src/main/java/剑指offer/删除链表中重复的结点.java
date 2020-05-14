package 剑指offer;

public class 删除链表中重复的结点 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode start = new ListNode(0);
        start.next = pHead;
        ListNode pre = start;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return start.next;
    }
}
