package mid;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    private char[][] chars = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
            {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        letterCombinations(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void letterCombinations(List<String> result, StringBuilder list, String digits, int top) {
        if (top < digits.length()) {
            int k = digits.charAt(top) - '0' - 2;
            for (int j = 0; j < chars[k].length; j++) {
                list.append(chars[k][j]);
                if (list.length() == digits.length()) {
                    result.add(list.toString());
                } else {
                    letterCombinations(result, list, digits, top + 1);
                }
                list.deleteCharAt(list.length() - 1);
            }
        }
    }
}
