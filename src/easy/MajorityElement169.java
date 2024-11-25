package easy;

public class MajorityElement169 {

    public static void main(String args[]) {
        System.out.println(new MajorityElement169().majorityElement(new int[]{1, 3, 3}));
    }

    public int majorityElement(int[] nums) {
        int[] count = new int[nums.length / 2 + 1];
        int[] number = new int[nums.length / 2 + 1];
        int max = 0, num = 0, t = 0;
        boolean isExist;
        for (int i = 0; i < nums.length; i++) {
            isExist = false;
            for (int j = 0; j < t; j++) {
                if (number[j] == nums[i]) {
                    isExist = true;
                    count[j]++;
                    if (max < count[j]) {
                        max = count[j];
                        num = number[j];
                    }
                    break;
                }
            }
            if (!isExist) {
                number[t] = nums[i];
                count[t] = 1;
                if (max < count[t]) {
                    max = count[t];
                    num = number[t];
                }
                t++;
            }
        }
        return num;
    }
}
