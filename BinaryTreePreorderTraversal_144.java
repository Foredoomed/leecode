import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal_144 {

	public List<Integer> preorderTraversal(TreeNode node) {
		List<Integer> list = new LinkedList<Integer>();
		Stack<TreeNode> rights = new Stack<TreeNode>();
		while(node != null) {
			list.add(node.val);
			if (node.right != null) {
				rights.push(node.right);
			}
			node = node.left;
			if (node == null && !rights.isEmpty()) {
				node = rights.pop();
			}
		}
	    return list;
	}

}
