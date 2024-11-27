package mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetZeroes73 {

    public void setZeroes(int[][] matrix) {
        int[] p = new int[matrix.length];
        int[] q = new int[matrix[0].length];
        int p_top = 0, q_top = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    boolean needAdd = true;
                    for (int k = 0; k < p_top; k++) {
                        if (p[k] == i) {
                            needAdd = false;
                            break;
                        }
                    }
                    if (needAdd) {
                        p[p_top++] = i;
                    }
                    needAdd = true;
                    for (int k = 0; k < q_top; k++) {
                        if (q[k] == j) {
                            needAdd = false;
                            break;
                        }
                    }
                    if (needAdd) {
                        q[q_top++] = j;
                    }
                }
            }
        }
        for (int k = 0; k < p_top; k++) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[p[k]][i] = 0;
            }
        }
        for (int k = 0; k < q_top; k++) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][q[k]] = 0;
            }
        }
    }
}
