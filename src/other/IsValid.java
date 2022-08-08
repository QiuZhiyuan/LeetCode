package other;

import java.util.ArrayList;
import java.util.List;

public class IsValid {

    public static void main(String args[]) {
        System.out.println(new IsValid().isValid("([]{})"));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        List<Integer> bracket1 = new ArrayList<>();
        List<Integer> bracket2 = new ArrayList<>();
        List<Integer> bracket3 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    bracket1.add(i);
                    break;
                case ')':
                    if (!bracket1.isEmpty() && (i - bracket1.get(bracket1.size() - 1)) % 2 == 1) {
                        bracket1.remove(bracket1.size() - 1);
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    bracket2.add(i);
                    break;
                case ']':
                    if (!bracket2.isEmpty() && (i - bracket2.get(bracket2.size() - 1)) % 2 == 1) {
                        bracket2.remove(bracket2.size() - 1);
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    bracket3.add(i);
                    break;
                case '}':
                    if (!bracket3.isEmpty() && (i - bracket3.get(bracket3.size() - 1)) % 2 == 1) {
                        bracket3.remove(bracket3.size() - 1);
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        if (bracket1.isEmpty() && bracket2.isEmpty() && bracket3.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
