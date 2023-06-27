

import java.util.HashMap;

public class FirstUniqueCharacter {

    public static int firstUniqueCharacter(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, count + 1);
        }

        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = charCountMap.get(c);
            if (count == 1) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        int index = firstUniqueCharacter(s);
        System.out.println(index);
    }
}
