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
		hashSet.add("b");
		hashSet.add("bb");
		hashSet.add("ab");
		hashSet.add("baa");
		hashSet.add("aab");

		WordBreakII_DP wb = new WordBreakII_DP();
//		wb.wordBreak("catsanddog",hashSet);
		wb.wordBreak("aabbbaa",hashSet);
//		System.out.println(wb.wordBreak("ababbabababababaababbaabbababaababababababababaabababababaababababbababaaaaababbababababababaabbabab",hashSet));
	}


}
