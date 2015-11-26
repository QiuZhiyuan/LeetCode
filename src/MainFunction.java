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

//		hashSet.add("a");
//		hashSet.add("ab");
//		hashSet.add("baa");
//		hashSet.add("aab");

		hashSet.add("a");
		hashSet.add("b");

		WordBreakII wb = new WordBreakII();
//		wb.wordBreak("catsanddog",hashSet);
//		System.out.println(wb.wordBreak("aaabaa",hashSet));
		System.out.println(wb.wordBreak("abaaba",hashSet));
	}

//	["a b a a b a ","a b a ab a ","a b aa b a ",,"a ba a b a ","a ba a ba "]
//	["a b a a b a","a b a ab a","a b aa b a",,"a ba a b a","a ba a ba",]
//	["a b a a b a","a b a a ba","a b a ab a","a b aa b a","a b aa ba","a ba a b a","a ba a ba","a ba ab a","ab a a b a","ab a a ba","ab a ab a","ab aa b a","ab aa ba"]
//	["a b a a b a","a b a a ba","a b a ab a","a b aa b a","a b aa ba","a ba a b a","a ba a ba","a ba ab a","ab a a b a","ab a a ba","ab a ab a","ab aa b a","ab aa ba"]
//
//			["a b a a b a","a b a a ba","a b a ab a","a b a aba","a b aa b a","a b aa ba","a ba a b a","a ba a ba","a ba ab a","a ba aba","a baa b a","a baa ba","ab a a b a","ab a a ba","ab a ab a","ab a aba","ab aa b a","ab aa ba","aba a b a","aba a ba","aba ab a","aba aba"]
//			["a b a a b a","a b a a ba","a b a ab a","a b a aba","a b aa b a","a b aa ba","a ba a b a","a ba a ba","a ba ab a","a ba aba","a baa b a","a baa ba","ab a a b a","ab a a ba","ab a ab a","ab a aba","ab aa b a","ab aa ba","aba a b a","aba a ba","aba ab a","aba aba"]

}
