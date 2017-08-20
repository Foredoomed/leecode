
public class LongestIncreasingSubsequence_300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestIncreasingSubsequence_300 li = new LongestIncreasingSubsequence_300();
		int[] nums = { 10, 9, 2, 5, 3, 4 };
		System.out.println(li.lengthOfLIS(nums));
	}

	public int lengthOfLIS(int[] nums) {
		
		int res = 0;
		int[] ee = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j =0; j < i; j++) {
				if (nums[i] > nums[j]) {
					ee[i] = Math.max(ee[i], ee[j] +1);
				}
			}

			res = Math.max(ee[i]+1, res);
		}
		return res ;
	}
}
