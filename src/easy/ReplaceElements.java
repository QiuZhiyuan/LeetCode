package easy;

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int last = arr.length - 1;
        int max = arr[last];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[last] = arr[i];
            arr[i] = max;
            if (arr[last] > max) {
                max = arr[last];
            }
        }
        arr[last] = -1;
        return arr;
    }
}
