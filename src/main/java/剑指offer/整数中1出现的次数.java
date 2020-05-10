package 剑指offer;

public class 整数中1出现的次数 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int ones = 0;
        for (long m = 1; m <= n; m *= 10) {
            long a = n / m;
            long b = n % m;
            if (a % 10 == 1) {
                ones += (a + 8) / 10 * m + (b + 1);
            } else {
                ones += (a + 8) / 10 * m;
            }

        }
        return ones;
    }
}
