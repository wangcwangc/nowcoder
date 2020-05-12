package 剑指offer;

public class 翻转单词顺序列 {
    public String ReverseSentence(String str) {
        if (str.split(" ").length <= 1) return str;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = str.split(" ");
        for (int i = strings.length - 1; i > 0; i--) {
            stringBuilder.append(strings[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.append(strings[0]);
        return stringBuilder.toString();
    }
}
