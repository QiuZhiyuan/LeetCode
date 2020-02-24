package easy;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        HashMap<Character, String> stringHashMap = new HashMap<>();
        HashMap<String, Character> characterHashMap = new HashMap<>();
        if (pattern.length() != strings.length) {
            return false;
        }
//        for (int i = 0; i < pattern.length(); i++) {
//            String temp = stringHashMap.get(pattern.charAt(i));
//            Character character = characterHashMap.get()
//            if (temp == null) {
//                stringHashMap.put(pattern.charAt(i), strings[i]);
//                characterHashMap.put(strings[i], pattern.charAt(i));
//            } else {
//                if (!strings[i].equals(temp)) {
//                    return false;
//                }
//            }
//        }
        return true;
    }
}
