
public class BullsandCows_299 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BullsandCows_299 bc = new BullsandCows_299();
		System.out.println(bc.getHint("1807", "7810"));
	}

	public String getHint(String secret, String guess) {
		char[] s = secret.toCharArray();
		char[] g = guess.toCharArray();

		int[] t = new int[1024];
		int cows = 0;
		int bulls = 0;
		for (int i = 0; i < secret.length(); i++) {
			if (s[i] == g[i]) {
				bulls++;
			} else {
				if (t[s[i]]++ < 0) {
					cows++;

				}
				if (t[g[i]]-- > 0) {
					cows++;

				}
			}
		}
		return bulls + "A" + cows + "B";
	}

}
