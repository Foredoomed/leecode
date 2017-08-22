
public class HIndex_274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int hIndex(int[] citations) {
		int length = citations.length;
		if (length == 0) {
			return 0;
		}

		int[] dp = new int[length + 1];
		for (int i = 0; i < length; i++) {
			if (citations[i] > length) {
				dp[length] += 1;
			} else {
				dp[citations[i]] += 1;
			}
		}

		int res = 0;

		for (int i = length; i >= 0; i--) {
			res = res + dp[i];
			if (res >= i) {
				return i;
			}
		}
		return 0;
	}

}
