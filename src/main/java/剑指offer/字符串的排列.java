package 剑指offer;

import java.util.ArrayList;

public class 字符串的排列 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str.length() == 1) {
            result.add(str);
            return result;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int length = chars.length;
            StringBuilder temp = new StringBuilder();
            int j = 0;
            while (length > 0) {
                if (i != j) {
                    temp.append(chars[j]);
                }
                length--;
                j++;
            }
            for (String s : Permutation(temp.toString())) {
                if (!result.contains(chars[i] + s)) {
                    result.add(chars[i] + s);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        字符串的排列 a = new 字符串的排列();
        System.out.println(a.Permutation("aab"));
    }
}
