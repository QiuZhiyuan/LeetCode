import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2015/11/27.
 */
public class WordBreakII_DP {
    private int l;
    private String[][] map;
    private List<String> result;
    private String str;
    private List<String> wordList;

    public List<String> wordBreak(String s, Set<String> wordDict) {

        l = s.length();
        str = s;
        map = new String[l + 1][l + 1];
        result = new ArrayList<String>();
        wordList = new ArrayList<String>();

        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j <= l; j++) {
                String str = s.substring(i, j);
                if (wordDict.contains(str)) {
                    map[i][j] = str;
                } else {
                    map[i][j] = null;
                }
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        search(0);
        System.out.println(result.toString());


        return null;

    }

    private void search(int x) {
        for (int i = x + 1; i <= l; i++) {
            if(map[x][i] != null){
                wordList.add(map[x][i]);
                if(i == l){
                    StringBuilder itemList = new StringBuilder();
                    for (int k=0;k<wordList.size();k++) {
                        String item = wordList.get(k);
                        itemList.append(item);
                        if (k < wordList.size() - 1) {
                            itemList.append(" ");
                        }
                    }
                    result.add(itemList.toString());
                } else {
                    search(i);
                }
                if(wordList.size() >0){
                    wordList.remove(wordList.size()-1);
                }
            }
        }
    }

}
