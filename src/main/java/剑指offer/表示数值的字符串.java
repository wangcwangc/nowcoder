package 剑指offer;

public class 表示数值的字符串 {
    public boolean isNumeric(char[] str) {
        boolean hasE = false;
        boolean sign = false;
        boolean decimal = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'e' || str[i] == 'E') {
                if (i == str.length - 1) return false;
                if (hasE) return false;
                hasE = true;
            } else if (str[i] == '+' || str[i] == '-') {
                if (sign && str[i - 1] != 'e' && str[i - 1] != 'E') return false;
                if (!sign && i > 0 && str[i - 1] != 'e' && str[i - 1] != 'E') return false;
                sign = true;
            } else if (str[i] == '.') {
                if (hasE || decimal) return false;
                decimal = true;
            } else if (str[i] < '0' || str[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
