package 剑指offer;

public class 调整数组顺序使奇数位于偶数前面 {
    public void reOrderArray(int[] array) {
        int length = array.length;
        int[] result = array.clone();
        int q = 0;
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (result[i] % 2 == 1) {
                array[q] = result[i];
                q++;
            }
            if (result[length - i - 1] % 2 == 0) {
                array[length - j - 1] = result[length - i - 1];
                j++;
            }
        }
    }
}
