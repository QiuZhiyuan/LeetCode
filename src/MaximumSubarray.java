/**
 * Created by qiuzhiyuan on 2015/12/2.
 *
 * 求序列中连续最大和
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        int[][] sum = new int[l][l];
        int maxSum = nums[0];

        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(j == i){
                    sum[i][j] = nums[j];
                } else {
                    sum[i][j] = sum[i][j-1]+nums[j];
                }
                if(maxSum<sum[i][j]){
                    maxSum = sum[i][j];
                }
            }
        }
        return maxSum;
    }
}
