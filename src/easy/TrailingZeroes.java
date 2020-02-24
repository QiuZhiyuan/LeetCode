package easy;

public class TrailingZeroes {

    public static void main(String args[]){
        System.out.print(new TrailingZeroes().trailingZeroes(100));
    }

    public int trailingZeroes(int n) {
        int count = 0;
        while (n / 5 > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
