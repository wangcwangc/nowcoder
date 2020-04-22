package 剑指offer;

public class 数值的整数次方 {
    public double Power(double base, int exponent) {
        if (base == 0.0) return base;
        double result = 1.0d;
        int exp = exponent > 0 ? exponent : -exponent;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return exponent > 0 ? result : 1 / result;
    }
}
