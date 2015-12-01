import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by qiuzhiyuan on 2015/11/30.
 */
public class WordBreakII_Simple {
    List<String> result;
    public List<String> wordBreak(String s, Set<String> wordDict) {
        result = new ArrayList<String>();
        int n = s.length();
        List<Integer>[] pointer = new List[n];
        for(int i=0;i<n;i++) pointer[i]=new ArrayList<Integer>();
        //DP to record break point
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(wordDict.contains(s.substring(j,i+1))&&(j==0||pointer[j-1].size()>0))
                    pointer[i].add(j);
            }
        }
        helper(pointer, s, n-1, "");
        System.out.println(result.toString());
        return result;
    }
    //DFS to retrieve results
    public void helper(List<Integer>[] pointer, String s, int i, String pattern){
        System.out.println(s+" "+i+" "+pattern);
        if(i<0){
            result.add(pattern);
            return;
        }
        for(Integer item:pointer[i]){
            String nextPattern = pattern.length()==0?s.substring(item,i+1):s.substring(item,i+1)+" "+pattern;
            helper(pointer, s, item-1, nextPattern);
        }
    }
}
