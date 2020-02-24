package easy;

public class MaxProfit {
    public int maxProfitI(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int max = 0;
        int minPrices = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= minPrices) {
                minPrices = prices[i];
            } else if (prices[i] - minPrices > max) {
                max = prices[i] - minPrices;
            }
        }
        return max;
    }

    public int maxProfitII(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int max = 0;
        int minPrices = prices[0];
        int i = 1;
        while (i < prices.length) {
            if (prices[i] < minPrices) {
                minPrices = prices[i];
                i++;
            } else {
                i++;
                while (i < prices.length && prices[i] >= prices[i - 1]) {
                    i++;
                }
                max += prices[i - 1] - minPrices;
                if (i < prices.length) {
                    minPrices = prices[i];
                }
            }
        }
        return max;
    }

    public int maxProfitII_X(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int d = prices[i] - prices[i - 1];
            if (d > 0) {
                max += d;
            }
        }
        return max;
    }
}
