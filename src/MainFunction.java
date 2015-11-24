
public class MainFunction {

	public static void main(String args[]){
		MainFunction mf = new MainFunction();
		
		mf.start();
	}
	
	private void start(){
		ValidNumber vn = new ValidNumber();
		vn.isNumber("2e10");
		vn.isNumber(" 0.1");
		vn.isNumber("1 a");
		vn.isNumber("abc");
		vn.isNumber("929323.32f");
		vn.isNumber("-1.");
		vn.isNumber("0x234");
		vn.isNumber("959440.94f");
	}


}
