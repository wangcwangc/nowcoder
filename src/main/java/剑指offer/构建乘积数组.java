package 剑指offer;

public class 构建乘积数组 {
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if (length > 0) {
            B[0] = 1;
            for (int i = 1; i < length; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }
            int temp = 1;
            for (int i = length - 2; i >= 0; i--) {
                temp *= A[i + 1];
                B[i] *= temp;
            }
        }
        return B;
    }
}
