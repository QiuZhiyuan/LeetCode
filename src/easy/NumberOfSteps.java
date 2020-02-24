package src.easy;

/**
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 */
public class NumberOfSteps {
    public static void main(String args[]) {

    }

    public int numbersOfSteps(int num) {
        int i = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                num--;
            } else {
                num /= 2;
            }
            i++;
        }
        return i;
    }
}
