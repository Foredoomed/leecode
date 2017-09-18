
public class FlattenBinaryTreetoLinkedList_114 {
	private TreeNode prev = null;

	public void flatten(TreeNode root) {
		if (root == null)
			return;
		flatten(root.right);
		flatten(root.left);
		root.right = prev;
		root.left = null;
		prev = root;
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	
	
	public static void main(String[] args) {
		FlattenBinaryTreetoLinkedList_114 ft = new FlattenBinaryTreetoLinkedList_114();
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		a.left = b;
		a.right = c;
		
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(6);
		b.left = d;
		b.right = e;
		c.right = f;
		
		ft.flatten(a);
	}
}
