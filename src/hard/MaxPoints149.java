package hard;

import java.util.*;

public class MaxPoints149 {

    public static void main(String[] args) {
        System.out.println(new MaxPoints149().gdc(0, 0));
    }

    public int maxPoints(int[][] points) {
        int n1, n2;
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            max = 1 > max ? 1 : max;
            Map<String, Integer> slopeMap = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                n1 = y1 - y2;
                n2 = x1 - x2;
                String slope;
                if (n1 == 0) {
                    slope = 0 + "/n";
                } else if (n2 == 0) {
                    slope = "n/" + 0;
                } else {
                    int g = gdc(n1, n2);
                    slope = (n1 / g) + "/" + (n2 / g);
                }
                if (slopeMap.containsKey(slope)) {
                    int count = slopeMap.get(slope);
                    count++;
                    max = count > max ? count : max;
                    slopeMap.put(slope, count);
                } else {
                    max = 2 > max ? 2 : max;
                    slopeMap.put(slope, 2);
                }
            }
        }
        return max;
    }

    private int gdc(int x, int y) {
        return x == 0 ? y : (gdc(y % x, x));

    }
}
