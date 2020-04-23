package 剑指offer;

import java.util.Stack;

public class 反转链表 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode newList = new ListNode(stack.pop());
        ListNode p = newList;
        while (!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop());
            p.next = node;
            p = p.next;
        }
        return newList;
    }
}
