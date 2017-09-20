
public class ConvertSortedArraytoBinarySearchTree_108 {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		return dfs(nums, 0, nums.length - 1);
	}

	private TreeNode dfs(int[] nums, int start, int end) {
		if (start > end)
			return null;
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = dfs(nums, start, mid - 1);
		root.right = dfs(nums, mid + 1, end);
		return root;
	}

}
