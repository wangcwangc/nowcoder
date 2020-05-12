package 剑指offer;

import java.util.ArrayList;

public class 和为S的两个数字 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] < sum) {
                left++;
            }
            if (array[left] + array[right] > sum) {
                right--;
            }
            if (array[left] + array[right] == sum) {
                result.add(array[left]);
                result.add(array[right]);
                break;
            }
        }
        return result;
    }
}
