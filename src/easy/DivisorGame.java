package easy;

/**
 * 1025. 除数博弈
 * 题解，奇数先手必输，偶数可以让对方变成"奇数先手"，所以偶数先手必赢
 */
public class DivisorGame {
    public boolean divisorGame(int N) {
        return (N & 1) == 0;
    }
}
