import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by qiuzhiyuan on 2015/11/25.
 * 题目描述
 * 词串："catsanddog"
 * 词典:"cat","cats","and","sand","dog"
 * 根据词典分解词串
 * 结果返回["cats and dog","cat sand dog"]
 */
public class WordBreakII {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        if (s.equals("") || wordDict.size() == 0) {
            return result;
        }
        this.s = s;
        this.wordDict = wordDict;
        search(0, 1);
//        for(String str:result){
//            print("result:" + str);
//        }
        return result;
    }

    private List<String> wordList = new ArrayList<String>();

    private List<String> result = new ArrayList<String>();

    private String s;

    private Set<String> wordDict;

    public void search(int begin, int end) {
        print(begin+" "+end);
        if (begin == s.length()) {
            return;
        }
        String item = s.substring(begin, end);
        if (wordDict.contains(item)) {
            print(item);
            wordList.add(item);
            if (end == s.length()) {
                //add to result;
                StringBuilder itemList = new StringBuilder();
                for (int i=0;i<wordList.size();i++) {
                    String str = wordList.get(i);
                    itemList.append(str);
                    if (i < wordList.size() - 1) {
                        print("add:"+str+" index:"+wordList.indexOf(str)+" size:"+wordList.size());
                        itemList.append(" ");
                    }
                }
                print("itemList:"+itemList.toString());
                result.add(itemList.toString());

                if(wordList.size() >0){
                    wordList.remove(wordList.size()-1);
                }
                print("wordList"+wordList.toString());
            } else {
                search(end, end + 1);
            }
        }
        if (end != s.length()) {
            search(begin, end + 1);
        } else {
            if(wordList.size() >0){
                wordList.remove(wordList.size()-1);
            }
            print("wordList"+wordList.toString());
        }
    }

    private void print(String str) {
//        System.out.println(str);
    }


}
