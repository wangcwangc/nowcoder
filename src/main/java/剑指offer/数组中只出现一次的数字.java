package 剑指offer;

import java.util.HashSet;
import java.util.Iterator;

public class 数组中只出现一次的数字 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : array) {
            if (hashSet.contains(i)) {
                hashSet.remove(i);
            } else {
                hashSet.add(i);
            }
        }
        Iterator<Integer> iterable = hashSet.iterator();
        num1[0] = iterable.next();
        num2[0] = iterable.next();
    }
}
