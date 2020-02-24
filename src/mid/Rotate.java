package mid;

public class Rotate {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < (matrix.length + 1) / 2; i++) {
            int size = matrix.length - i - 1;
            for (int j = i; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size - j][i];
                matrix[size - j][i] = matrix[size][size - j];
                matrix[size][size - j] = matrix[j][size];
                matrix[j][size] = temp;
            }
        }
    }
}
