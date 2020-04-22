package 剑指offer;

import java.util.HashMap;

public class 变态跳台阶 {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int JumpFloorII(int target) {
        int result = 1;
        if (target <= 0) return -1;
        else if (hashMap.containsKey(target)) {
            return hashMap.get(target);
        } else {
            for (int i = 1; i < target; i++) {
                result += JumpFloorII(target - i);
            }
        }
        hashMap.put(target, result);
        return result;
    }
}
