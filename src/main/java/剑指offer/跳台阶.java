package 剑指offer;

import java.util.HashMap;

public class 跳台阶 {
    public int JumpFloor(int target) {
        if (target <= 0) return -1;
        else if (target == 2) {
            return 2;
        } else if (target == 1) {
            return 1;
        } else {
            return JumpFloor(target - 2) + JumpFloor(target - 1);
        }
    }


    //优化后
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int JumpFloor2(int target) {
        if (target <= 0) return -1;
        else if (target == 2) {
            return 2;
        } else if (target == 1) {
            return 1;
        } else if (hashMap.containsKey(target)) {
            return hashMap.get(target);
        } else {
            int result = JumpFloor2(target - 2) + JumpFloor2(target - 1);
            hashMap.put(target, result);
            return result;
        }
    }

}
