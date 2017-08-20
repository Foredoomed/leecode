
public class TwoSumII_167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumII_167 ts = new TwoSumII_167();
		ts.twoSum(new int[] { 2, 7, 11, 15 }, 9);
	}

	public int[] twoSum(int[] numbers, int target) {
		int l = 0, r = numbers.length - 1;
		while (l < r) {
			int sum = numbers[l] + numbers[r];
			if (sum == target)
				return new int[] { l + 1, r + 1 };
			else if (sum < target)
				++l;
			else
				--r;
		}
		return null;
	}
}
