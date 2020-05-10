package 剑指offer;

public class 连续子数组的最大和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int result = array[0];
        int maxSub = array[0];
        for (int i = 1; i < array.length; i++) {
            maxSub = Math.max(maxSub + array[i], array[i]);
            result = Math.max(maxSub, result);
        }
        return result;
    }
}
