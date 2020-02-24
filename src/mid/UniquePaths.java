package mid;

public class UniquePaths {

    public static void main(String args[]) {
        System.out.println(new UniquePaths().uniquePaths(8, 4));
    }

    public int uniquePaths(int m, int n) {
        int[] paths;
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        paths = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    paths[j] = 1;
                } else {
                    paths[j] = paths[j] + paths[j - 1];
                }
            }
        }
        return paths[n - 1];

    }
}
