package easy;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class OrangesRotting {
    public static void main(String args[]) {
        new OrangesRotting().orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}});
    }

    public int orangesRotting(int[][] grid) {
        int min = 0;
        int rot = -1;
        int count = 0;
        while (rot != 0) {
            rot = 0;
            count = 0;
            min++;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1) {
                        boolean flag = false;
                        int curr = 2 + min;
                        if (!flag && i + 1 < grid.length) {
                            flag = (grid[i + 1][j] >= 2 && grid[i + 1][j] < curr);
                        }
                        if (!flag && j + 1 < grid[i].length) {
                            flag = (grid[i][j + 1] >= 2 && grid[i][j + 1] < curr);
                        }
                        if (!flag && i > 0) {
                            flag = (grid[i - 1][j] >= 2 && grid[i - 1][j] < curr);
                        }
                        if (!flag && j > 0) {
                            flag = (grid[i][j - 1] >= 2 && grid[i][j - 1] < curr);
                        }
                        if (flag) {
                            grid[i][j] = curr;
                            rot++;
                        } else {
                            count++;
                        }
                    }
                }
            }
            if (rot == 0) {
                min--;
            }
        }
        if (count > 0) {
            return -1;
        } else {
            return min;
        }
    }
}
