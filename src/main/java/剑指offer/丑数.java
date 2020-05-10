package 剑指offer;

public class 丑数 {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7) return index;
        int[] nums = new int[index];
        nums[0] = 1;
        int q2 = 0;
        int q3 = 0;
        int q5 = 0;
        for (int i = 1; i < index; i++) {
            nums[i] = Math.min(nums[q2] * 2, Math.min(nums[q3] * 3, nums[q5] * 5));
            if (nums[i] == nums[q2] * 2) q2++;
            if (nums[i] == nums[q3] * 3) q3++;
            if (nums[i] == nums[q5] * 5) q5++;
        }
        return nums[index - 1];
    }
}
