package other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiuzhiyuan on 2015/11/19.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {

        String[] strs = str.split(" ");
        String[] pats = pattern.split("");
            if(strs.length != pats.length || pattern.equals("")){
            return false;
        }
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String,String> map2 = new HashMap<String, String>();

        for (int i = 0; i < strs.length; i++) {
//            System.out.println("pat:"+pats[i]+" str:"+strs[i]);
            if(map1.get(pats[i]) == null&&map2.get(strs[i]) == null){
                map1.put(pats[i],strs[i]);
                map2.put(strs[i],pats[i]);
            } else {
                if(!strs[i].equals(map1.get(pats[i])) || !pats[i].equals(map2.get(strs[i]))){
                    System.out.println(map1.toString()+map2.toString()+"false");
                    return false;
                }
            }
        }
        System.out.println(map1.toString()+map2.toString()+"true");
        return true;
    }
}
