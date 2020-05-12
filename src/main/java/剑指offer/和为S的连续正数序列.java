package 剑指offer;

import java.util.ArrayList;

public class 和为S的连续正数序列 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int left = 1;
        int right = 2;
        while (left < right) {
            int s = (left + right) * (right - left + 1) / 2;
            if (s < sum) {
                right++;
            }
            if (s > sum) {
                left++;
            }
            if (s == sum) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    arrayList.add(i);
                }
                result.add(arrayList);
                left++;
            }
        }
        return result;
    }
}
