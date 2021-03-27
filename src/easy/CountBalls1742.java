package easy;

public class CountBalls1742 {

    public int countBalls(int lowLimit, int highLimit) {
        int[] countList = new int[45];
        int sum, j;
        for (int i = lowLimit; i <= highLimit; i++) {
            sum = -1;
            j = i;
            while (j > 0) {
                sum += j % 10;
                j = j / 10;
            }
            countList[sum]++;
        }
        int max = 0;
        for (int n : countList) {
            if (max < n) {
                max = n;
            }
        }
        return max;
    }
}
