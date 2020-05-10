package 剑指offer;

public class 两个链表的第一个公共结点 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int p1Length = countListLength(pHead1);
        int p2Length = countListLength(pHead2);
        if (p1Length > p2Length) {
            pHead1 = stepNextList(pHead1, p1Length - p2Length);
        } else {
            pHead2 = stepNextList(pHead2, p2Length - p1Length);
        }
        while (pHead1 != null) {
            if (pHead1 == pHead2) return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }

    private int countListLength(ListNode listNode) {
        int result = 0;
        while (listNode != null) {
            listNode = listNode.next;
            result++;
        }
        return result;
    }

    private ListNode stepNextList(ListNode listNode, int step) {
        while (step > 0) {
            listNode = listNode.next;
            step--;
        }
        return listNode;
    }
}
