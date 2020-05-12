package 剑指offer;

public class 扑克牌顺子 {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length != 5) return false;
        boolean[] dup = new boolean[5];
        int min = 14;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                int index = numbers[i] % 5;
                if (dup[index]) {
                    return false;
                }
                dup[index] = true;
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        if (max - min <= 5) {
            return true;
        }
        return false;
    }
}
