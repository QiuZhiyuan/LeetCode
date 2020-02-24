package mid;

import java.util.Arrays;

public class SortArray {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(new SortArray().sortArray(new int[]{3, 4, 2, 1, 4, 5, 2, 4})));
        System.out.println(Arrays.toString(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    }

    public int[] sortArray(int[] nums) {
//        quickSort(nums, 0, nums.length - 1);
        heapSort(nums);
        return nums;
    }

    private void quickSort(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        if (i < j) {
            int temp = nums[i];
            while (i < j) {
                while (nums[j] >= temp && i < j) {
                    j--;
                }
                nums[i] = nums[j];
                while (nums[i] <= temp && i < j) {
                    i++;
                }
                nums[j] = nums[i];
            }
            nums[i] = temp;
            quickSort(nums, start, i - 1);
            quickSort(nums, i + 1, end);
        }
    }

    private void heapSort(int[] nums) {
        int top = 0;
        while (top < nums.length) {
            for (int i = (nums.length + top) / 2 - 1; i >= top; i--) {
                int left = 2 * i + 1 - top;
                int right = 2 * i + 2 - top;
                int minIndex = i;
                if (right < nums.length) {
                    if (nums[right] < nums[minIndex]) {
                        minIndex = right;
                    }
                }
                if (left < nums.length) {
                    if (nums[left] < nums[minIndex]) {
                        minIndex = left;
                    }
                }
                if (minIndex != i) {
                    int temp = nums[minIndex];
                    nums[minIndex] = nums[i];
                    nums[i] = temp;
                }
            }
            top++;
        }
    }
}
