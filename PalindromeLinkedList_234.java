
public class PalindromeLinkedList_234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public boolean isPalindrome(ListNode head) {
		ListNode fast = head;
	    ListNode slow = head;

	    while(fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    if(fast != null) slow = slow.next;
	    
	    slow = reverse(slow);
	    while(slow != null && head.val == slow.val) {
	        head = head.next;
	        slow = slow.next;
	    }
	    return slow == null;
	}
	
	private ListNode reverse(ListNode head) {
	    ListNode prev = null;
	    while(head != null) {
	        ListNode next = head.next;
	        head.next = prev;
	        prev = head;
	        head = next;
	    }
	    return prev;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}