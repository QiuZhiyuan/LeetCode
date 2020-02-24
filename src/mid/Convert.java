package mid;

public class Convert {
    public static void main(String args[]) {
        System.out.println(new Convert().convert("PAYPALISHIRING", 4));
    }

    public String convert(String s, int numRows) {
        System.out.println(s);
        if (s.length() < numRows || numRows <= 1) {
            return s;
        }
        int top = 0;
        char[][] form = new char[numRows][s.length() / (numRows - 1) + 1];
        int start;
        int end;
        start = numRows - 2;
        end = 1;
        for (int i = 0; i < form[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (top < s.length()) {
                        form[j][i] = s.charAt(top);
                        top++;
                    } else {
                        form[j][i] = ' ';
                    }

                }
            } else {
                form[numRows - 1][i] = ' ';
                form[0][i] = ' ';
                for (int j = start; j >= end; j--) {
                    if (top < s.length()) {
                        form[j][i] = s.charAt(top);
                        top++;
                    } else {
                        form[j][i] = ' ';
                    }

                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < form[i].length; j++) {
                if (form[i][j] != ' ') {
                    sb.append(form[i][j]);
                }
                System.out.print(form[i][j]);
            }
            System.out.println();
        }
        return sb.toString();
    }
}
