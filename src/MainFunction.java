import java.util.HashSet;
import java.util.TreeSet;

public class MainFunction {

	public static void main(String args[]){
		MainFunction mf = new MainFunction();
		
		mf.uniquePaths();
	}

	private void uniquePaths(){
		UniquePaths up = new UniquePaths();
		System.out.println(up.uniquePaths(23,43));
	}
	
	private void WordBreak(){
		HashSet<String> hashSet = new HashSet<String>();
//		hashSet.add("cat");
//		hashSet.add("cats");
//		hashSet.add("and");
//		hashSet.add("sand");
//		hashSet.add("dog");
//		hashSet.add("ca");

		hashSet.add("ab");
//		hashSet.add("b");
//		hashSet.add("ab");
//		hashSet.add("baa");
//		hashSet.add("aa");
//		hashSet.add("ba");

		WordBreakII_DP wb = new WordBreakII_DP();
		WordBreakII_Simple wbs = new WordBreakII_Simple();
//		wb.wordBreak("ababbabab",hashSet);
		wbs.wordBreak("ababbabab",hashSet);

		hashSet.add("a");
		hashSet.add("aa");
		hashSet.add("aaa");
		hashSet.add("aaaa");
		hashSet.add("aaaaa");
		hashSet.add("aaaaaa");
		hashSet.add("aaaaaaa");
		hashSet.add("aaaaaaaa");
		hashSet.add("aaaaaaaaa");
		hashSet.add("aaaaaaaaaa");



//		wb.wordBreak("baaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+
//				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
//				hashSet);
		System.out.println("finish");
//		wbs.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+
//						"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
//				hashSet);
	}


}
