package other;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by qiuzhiyuan on 2015/11/27.
 */
public class WordBreakII_DP {
    private int l;
    private int[][] map;
    private List<String> result;
    private String str;
    private int[] space;


    public List<String> wordBreak(String s, Set<String> wordDict) {

        l = s.length();
        str = s;
        map = new int[l][l + 1];
        result = new ArrayList<String>();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - i; j++) {
                map[i][j] = 0;
            }
        }

        for (int i = 0; i < l; i++) {
            int top = 0;
            for (int j = i + 1; j < l + 1; j++) {
                String str = s.substring(i, j);
                if (wordDict.contains(str)) {
                    map[i][top] = j;
                    System.out.print(map[i][top] + "+" + str + " ");
                    top++;
                }
            }
            System.out.println();
        }

        space = new int[l];
        search(0, 0);

        System.out.println(result.toString());


        return result;

    }

    private void search(int root, int top) {
        for (int j = 0; j < l; j++) {
            int sp = map[root][j];
            if (sp != 0) {
                if (sp == l) {
                    addToResult(top);
                } else {
                    space[top] = sp;
                    search(sp, top + 1);
                }
            } else {
                break;
            }
        }
    }

    private void addToResult(int top) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < top; i++) {
            sb.insert(space[i] + i, ' ');
        }
        result.add(sb.toString());
    }

    private void print(String info) {
        System.out.print(info);
    }
}
