
public class BullsandCows {
	public String getHint(String secret, String guess) {
		System.out.println(secret+" "+guess);
		
		int a = 0;
		int b = 0;

		boolean[] flag2 = new boolean[secret.length()];
		boolean[] flag1 = new boolean[secret.length()];
		for (int i = 0; i < flag1.length; i++) {

			if (secret.charAt(i) == guess.charAt(i)) {
				a++;
				flag1[i] = false;
				flag2[i] = false;
			} else {
				flag1[i] = true;
				flag2[i] = true;
			}
		}

		for (int i = 0; i < secret.length(); i++) {
			if(!flag1[i]){
				continue;
			}
			char c1 = secret.charAt(i);
			for (int j = 0; j < guess.length(); j++) {
				if (flag2[j]) {
					char c2 = guess.charAt(j);
					if (c1 == c2) {
						if (c2 == c1 && i != j) {
							b++;
						}
						flag2[j] = false;
						break;
					}
				}
			}
		}

		return a + "A" + b + "B";

	}

}
