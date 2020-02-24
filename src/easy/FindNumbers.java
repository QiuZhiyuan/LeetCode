package src.easy;

public class FindNumbers {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n >= 10) {
                if (n < 100) {
                    count++;
                } else if (n >= 1000) {
                    if (n < 10000) {
                        count++;
                    } else if (n >= 100000) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
