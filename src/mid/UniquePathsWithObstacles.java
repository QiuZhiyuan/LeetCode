package mid;

public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[] dp = new int[obstacleGrid[0].length];
        dp[0] = 1;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] != 1) {
                    if (i == 0 && j != 0) {
                        dp[j] = dp[j - 1];
                    } else if (i != 0 && j != 0) {
                        int sum = 0;
                        if (obstacleGrid[i - 1][j] != 1) {
                            sum += dp[j];
                        }
                        if (obstacleGrid[i][j - 1] != 1) {
                            sum += dp[j - 1];
                        }
                        dp[j] = sum;
                    }
                } else {
                    dp[j] = 0;
                }
            }
        }
        return dp[dp.length - 1];

    }
}
