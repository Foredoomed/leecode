package PopulatingNextRightPointersinEachNode_116;

public class PopulatingNextRightPointersinEachNodeII_117 {
	
	
	public static void main(String[] args) {
		PopulatingNextRightPointersinEachNodeII_117 pr = new PopulatingNextRightPointersinEachNodeII_117();
		TreeLinkNode r = new TreeLinkNode(1);
		TreeLinkNode rl = new TreeLinkNode(2);
		TreeLinkNode rr = new TreeLinkNode(3);
		r.left = rl;
		r.right = rr;
		
		TreeLinkNode rll = new TreeLinkNode(4);
		TreeLinkNode rlr = new TreeLinkNode(5);
		TreeLinkNode rrl = new TreeLinkNode(6);
		TreeLinkNode rrr = new TreeLinkNode(7);
		
		rl.left = rll;
		rl.right = rlr;
		rr.left = rrl;
		rr.right = rrr;
		
		
		pr.connect(r);
	}

	public void connect(TreeLinkNode root) {
		TreeLinkNode dummyHead = new TreeLinkNode(0);
		TreeLinkNode pre = dummyHead;
		while (root != null) {
			if (root.left != null) {
				pre.next = root.left;
				pre = pre.next;
			}
			if (root.right != null) {
				pre.next = root.right;
				pre = pre.next;
			}
			root = root.next;
			if (root == null) {
				pre = dummyHead;
				root = dummyHead.next;
				dummyHead.next = null;
			}
		}
		
//		
//		 TreeLinkNode firstNode = new TreeLinkNode(0); //Dummy head
//         TreeLinkNode pre = firstNode;
//         for(TreeLinkNode cur = root; cur != null; cur = cur.next){
//             if(cur.left != null){
//                 pre.next = cur.left;
//                 pre = cur.left;
//             }
//             if(cur.right != null){
//                 pre.next = cur.right;
//                 pre = cur.right;
//             }
//         }
//         root = firstNode.next;
	}

}

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}