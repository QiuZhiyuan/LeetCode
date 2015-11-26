import java.util.HashSet;
import java.util.TreeSet;

public class MainFunction {

	public static void main(String args[]){
		MainFunction mf = new MainFunction();
		
		mf.start();
	}
	
	private void start(){
		HashSet<String> hashSet = new HashSet<String>();
//		hashSet.add("cat");
//		hashSet.add("cats");
//		hashSet.add("and");
//		hashSet.add("sand");
//		hashSet.add("dog");

		hashSet.add("a");
		hashSet.add("ab");
		hashSet.add("baa");
		hashSet.add("aab");

		WordBreakII wb = new WordBreakII();
//		wb.wordBreak("catsanddog",hashSet);
		System.out.println(wb.wordBreak("aaabaa",hashSet));
	}


}
