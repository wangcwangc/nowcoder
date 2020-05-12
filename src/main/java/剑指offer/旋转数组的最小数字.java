package 剑指offer;

public class 旋转数组的最小数字 {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (array[left] >= array[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = left + (right - left) / 2;
            if (array[left] == array[mid] && array[mid] == array[right]) {
                return minArray(array);
            }
            if (array[mid] >= array[left]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
    }

    private int minArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[0];
    }
}
