import java.util.Arrays;

public class MissingNumber_268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber_268 mn = new MissingNumber_268();
		System.out.println(mn.missingNumber(new int[]{0}));
	}

	public int missingNumber(int[] nums) {
		
		int[] dp = new int[10000];
        Arrays.fill(dp,-1 );
		for (int i = 0; i < nums.length; i++) {
			dp[nums[i]] = 1;
		}

		for(int j =0;j<dp.length;j++){
			if(dp[j]==-1){
				return j;
			}
		}
		
		return -1;
		
		
//		int sum = nums.length;
//	    for (int i = 0; i < nums.length; i++)
//	        sum += i - nums[i];
//	    return sum;
	}

}
