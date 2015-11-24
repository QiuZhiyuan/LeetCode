/**
 * Created by Administrator on 2015/11/19.
 */
public class NumArray {

    int[] mNums;

    int[][] mSums;
    boolean[][] mHasSum;

    public NumArray(int[] nums) {
        mNums = nums;

        mSums = new int[nums.length][nums.length];
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                mHasSum[i][j] = false;
            }
        }
    }

    public int sumRange(int i, int j) {

        return 0;
    }
}