package 剑指offer;

import java.util.ArrayList;
import java.util.HashMap;

public class 字符流中第一个不重复的字符 {
    //Insert one char from stringstream
    HashMap<Character, Integer> hashMap = new HashMap<>();
    ArrayList<Character> arrayList = new ArrayList<>();

    public void Insert(char ch) {
        if (hashMap.containsKey(ch)) {
            int num = hashMap.get(ch);
            hashMap.put(ch, num + 1);
        } else {
            hashMap.put(ch, 1);
        }
        arrayList.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (Character character : arrayList) {
            if (hashMap.get(character) == 1) {
                return character;
            }
        }
        return '#';
    }
}
