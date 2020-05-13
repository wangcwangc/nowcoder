package 剑指offer;

import java.util.LinkedList;

public class 孩子们的游戏 {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0) return -1;
        if (n == 1) return 0;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        int index = -1;
        while (linkedList.size() > 1) {
            index = (index + m) % linkedList.size();
            linkedList.remove(index);
            index--;
        }
        return linkedList.get(0);
    }
}
