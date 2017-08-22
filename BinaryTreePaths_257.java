import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths_257 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	List<String> res = new ArrayList<String>();

	public List<String> binaryTreePaths(TreeNode root) {

		List<String> paths = new LinkedList<>();

		if (root == null)
			return paths;

		if (root.left == null && root.right == null) {
			paths.add(root.val + "");
			return paths;
		}

		for (String path : binaryTreePaths(root.left)) {
			paths.add(root.val + "->" + path);
		}

		for (String path : binaryTreePaths(root.right)) {
			paths.add(root.val + "->" + path);
		}

		return paths;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
