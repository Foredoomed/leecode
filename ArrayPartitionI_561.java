import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayPartitionI_561 {

	public static void main(String[] args) {
		ArrayPartitionI_561 ap = new ArrayPartitionI_561();
		int r = ap.arrayPairSum(new Integer[] { 1, 4, 3, 2 });
		System.out.println(r);
	}

	public int arrayPairSum(Integer[] nums) {
		List<Integer> temp = Arrays.asList(nums);
		Collections.sort(temp);
		Collections.reverse(temp);
		
		int res = 0;
		for (int i = 1; i < temp.size(); i=i+2) {
			res += temp.get(i);
		}
		
		return res;
	}
}
