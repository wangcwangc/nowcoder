package 剑指offer;

public class 连续子数组的最大和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (res >= 0)
                res += array[i];
            else
                res = array[i];
            if (res > max)
                max = res;
        }
        return max;
    }
}
