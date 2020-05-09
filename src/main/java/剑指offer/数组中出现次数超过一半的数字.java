package 剑指offer;

import java.util.HashMap;

public class 数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array.length == 1) return array[0];
        int half = array.length / 2;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(array[i]) == null) hashMap.put(array[i], 1);
            else {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
                if (hashMap.get(array[i]) > half) return array[i];
            }
            max = max > hashMap.get(array[i]) ? max : hashMap.get(array[i]);
            if (array.length - i - 1 + max < half) break;
        }
        return 0;
    }
}
