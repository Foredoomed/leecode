
public class RotateArray_189 {

	public static void main(String[] args) {
		RotateArray_189 ra = new RotateArray_189();
		ra.rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);

	}

	public void rotate(int[] nums, int k) {

		if (nums == null || nums.length < 2) {
			return;
		}

		k = k % nums.length;
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);

	}

	private void reverse(int[] nums, int i, int j) {
		int tmp = 0;
		while (i < j) {
			tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
			i++;
			j--;
		}
	}

}
