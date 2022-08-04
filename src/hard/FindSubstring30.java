package hard;

import common.Tools;

import java.util.*;

public class FindSubstring30 {
    public static void main(String args[]) {
        FindSubstring30 findSubstring30 = new FindSubstring30();
        long startTime = System.currentTimeMillis();
        Tools.println(findSubstring30.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}));
        Tools.println(System.currentTimeMillis() - startTime);
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (words.length == 0) {
            return result;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            hashMap.merge(word, 1, Integer::sum);
        }
        HashMap<String, Integer> tempHashMap = new HashMap<>(hashMap);
        int l = words[0].length();
        for (int i = 0; i + l <= s.length(); i++) {
            String start = s.substring(i, i + l);
            if (hashMap.containsKey(start)) {
                int flag = 0;
                for (int j = 0; j < words.length; j++) {
                    int p = i + l * j;
                    if (p + l > s.length()) {
                        break;
                    }
                    String item = s.substring(p, p + l);
                    Integer value = hashMap.get(item);
                    if (value != null && value > 0) {
                        if (value == 1) {
                            hashMap.remove(item);
                        } else {
                            hashMap.put(item, value - 1);
                        }
                        flag++;
                    } else {
                        break;
                    }
                }
                if (flag == words.length) {
                    result.add(i);
                }
                hashMap.putAll(tempHashMap);
            }
        }
        return result;
    }
}

/**
 * "wordgoodgoodgoodbestword"
 * ["word","good","best","good"]
 */