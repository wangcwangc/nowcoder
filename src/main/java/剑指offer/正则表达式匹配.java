package 剑指offer;

public class 正则表达式匹配 {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) return false;
        int strIndex = 0;
        int patternIndex = 0;
        return findMatch(str, strIndex, pattern, patternIndex);
    }

    private boolean findMatch(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (strIndex != str.length && pattern[patternIndex] == '.')) {
                return findMatch(str, strIndex, pattern, patternIndex + 2)
                        || findMatch(str, strIndex + 1, pattern, patternIndex);
            } else {
                return findMatch(str, strIndex, pattern, patternIndex + 2);
            }
        }
        if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (strIndex != str.length && pattern[patternIndex] == '.')) {
            return findMatch(str, strIndex + 1, pattern, patternIndex + 1);
        }
        return false;
    }
}
