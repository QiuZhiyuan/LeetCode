package easy;

public class ConvertToBase7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean flag = (num > 0);
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.insert(0, Math.abs(num % 7));
            num /= 7;
        }
        if (!flag) {
            sb.insert(0, '-');
        }
        return sb.toString();
    }
}
