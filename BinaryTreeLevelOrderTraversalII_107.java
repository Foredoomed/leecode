import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreeLevelOrderTraversalII_107 {

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
		addLevel(list, 0, root);
		return list;
	}

	private void addLevel(LinkedList<List<Integer>> list, int level, TreeNode node) {
		if (node == null)
			return;
		if (list.size() - 1 < level)
			list.addFirst(new LinkedList<Integer>());
		list.get(list.size() - 1 - level).add(node.val);
		addLevel(list, level + 1, node.left);
		addLevel(list, level + 1, node.right);
	}

}
