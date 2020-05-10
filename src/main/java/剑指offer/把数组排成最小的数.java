package 剑指offer;

public class 把数组排成最小的数 {
    public String PrintMinNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                long a = Long.valueOf(numbers[i] + "" + numbers[j]);
                long b = Long.valueOf(numbers[j] + "" + numbers[i]);
                if (a > b) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            stringBuilder.append(numbers[i]);
        }
        return stringBuilder.toString();
    }
}
