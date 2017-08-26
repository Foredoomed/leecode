import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum_239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 0) {
			return new int[0];
		}
		int n = nums.length;
		Deque<Integer> q = new ArrayDeque<Integer>();
		int[] res = new int[nums.length - k + 1];
		List<Integer> list = new ArrayList<Integer>();
		int t = 0;
		for (int i = 0; i < nums.length; i++) {
			while (!q.isEmpty() && q.peekLast() < nums[i]) {
				q.pollLast(); 
			}
			q.addLast(nums[i]);
			if (i > k - 1 && q.peekFirst() == nums[i - k]) {
				q.pollFirst();
			}
			if (i >= k - 1) {
				res[t++] = q.peekFirst();
			}
		}
		return res;
	}

}
