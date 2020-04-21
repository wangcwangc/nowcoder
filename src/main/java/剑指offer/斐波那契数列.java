package 剑指offer;

import java.util.HashMap;

public class 斐波那契数列 {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (hashMap.containsKey(n)) return hashMap.get(n);
        int result = Fibonacci(n - 1) + Fibonacci(n - 2);
        hashMap.put(n, result);
        return result;
    }
}
