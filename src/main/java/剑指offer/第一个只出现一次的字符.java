package 剑指offer;

import java.util.HashSet;

public class 第一个只出现一次的字符 {
    public int FirstNotRepeatingChar(String str) {
        char[] chars = str.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (!hashSet.contains(chars[i])) {
                int j;
                for (j = i + 1; j < chars.length; j++) {
                    if (chars[j] == chars[i]) {
                        hashSet.add(chars[j]);
                        break;
                    }
                }

                if (j == chars.length) {
                    return i;
                }
            }
        }
        return -1;
    }
}
