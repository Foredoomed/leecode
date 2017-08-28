import java.util.Set;
import java.util.TreeSet;

public class KthLargestElementinanArray_215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findKthLargest(int[] nums, int k) {
		Set<Integer> s = new TreeSet<Integer>();
		
		for(int i : nums){
			s.add(i);
		}
		
		int n = s.size();
		Integer[] i = s.toArray(new Integer[]{});
		return i[n-k-1];
	}
}
