package 剑指offer;

public class 复杂链表的复制 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode randomListNode = pHead;
        while (randomListNode != null) {
            RandomListNode clone = new RandomListNode(randomListNode.label);
            RandomListNode next = randomListNode.next;
            randomListNode.next = clone;
            clone.next = next;
            randomListNode = next;
        }
        randomListNode = pHead;
        while (randomListNode != null) {
            randomListNode.next.random = randomListNode.random == null ? null : randomListNode.random.next;
            randomListNode = randomListNode.next.next;
        }
        randomListNode = pHead;
        RandomListNode cloneRandomListNode = pHead.next;
        //TODO
        //标记一下
        while (randomListNode != null) {
            RandomListNode clone = randomListNode.next;
            randomListNode.next = clone.next;
            clone.next = clone.next == null ? null : clone.next.next;
            randomListNode = randomListNode.next;
        }
        return cloneRandomListNode;
    }
}
