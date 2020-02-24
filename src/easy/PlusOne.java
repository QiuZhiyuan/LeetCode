package easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i >= 0; i--) {
            int p = digits[i] + carry;
            digits[i] = p % 10;
            carry = p / 10;
            if (carry == 0) {
                break;
            }
        }
        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
//            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }

    public int[] plusOneX(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}
