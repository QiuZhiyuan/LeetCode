package mid;

import javax.sound.midi.MidiFileFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * <p>
 * 示例 2：
 * <p>
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^4
 */
public class Merge56 {

    public static void main(String args[]) {
        System.out.println(new Merge56().merge(new int[][]{new int[]{1, 2}}));
    }

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        boolean isChanged = false;
        for (int[] interval : intervals) {
            boolean isMerge = false;
            for (int[] item : list) {
                if (item[0] <= interval[0]) {
                    if (item[1] >= interval[1]) {
                        isMerge = true;
                    } else if (item[1] >= interval[0]) {
                        item[1] = interval[1];
                        isMerge = true;
                    }
                } else {
                    if (item[1] <= interval[1]) {
                        item[0] = interval[0];
                        item[1] = interval[1];
                        isMerge = true;
                    } else if (item[0] <= interval[1]) {
                        item[0] = interval[0];
                        isMerge = true;
                    }
                }
            }
            if (isMerge) {
                isChanged = true;
            }
            if (!isMerge) {
                list.add(interval);
            }
        }
        return isChanged ? merge(list.toArray(new int[][]{})) : intervals;
    }
}
