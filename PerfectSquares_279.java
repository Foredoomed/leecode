import java.util.Arrays;

public class PerfectSquares_279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectSquares_279 ps = new PerfectSquares_279();
		System.out.println(ps.numSquares(13));
	}

	public int numSquares(int n) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 1; i + j * j <= n; j++) {
				dp[i + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
			}
		}
		return dp[n];
	}

}
