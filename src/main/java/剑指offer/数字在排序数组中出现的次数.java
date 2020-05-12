package 剑指offer;

public class 数字在排序数组中出现的次数 {
    public int GetNumberOfK(int[] array, int k) {
        int pre = findIndex(array, k - 0.5);
        int next = findIndex(array, k + 0.5);
        return next - pre;
    }

    private int findIndex(int[] array, double k) {
        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
