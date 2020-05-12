package 剑指offer;

public class 左旋转字符串 {
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) return "";
        int length = str.length();
        n = n % length;
        str = str + str.substring(0, n);
        return str.substring(n);
    }
}
