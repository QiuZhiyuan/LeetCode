package easy;

public class NumRookCaptures999 {
    public int numRookCaptures(char[][] board) {
        int p = -1, q = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    p = i;
                    q = j;
                    break;
                }
            }
        }
        if (p == -1) {
            return 0;
        }
        int sum = 0;
        for (int i = p; i >= 0; i--) {
            if (board[i][q] == 'p') {
                sum++;
                break;
            } else if (board[i][q] == 'B') {
                break;
            }
        }
        for (int i = p; i < board.length; i++) {
            if (board[i][q] == 'p') {
                sum++;
                break;
            } else if (board[i][q] == 'B') {
                break;
            }
        }
        for (int i = q; i >= 0; i--) {
            if (board[p][i] == 'p') {
                sum++;
                break;
            } else if (board[p][i] == 'B') {
                break;
            }
        }
        for (int i = q; i < board[0].length; i++) {
            if (board[p][i] == 'p') {
                sum++;
                break;
            } else if (board[p][i] == 'B') {
                break;
            }
        }
        return sum;
    }
}
