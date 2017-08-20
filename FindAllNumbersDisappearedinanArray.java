import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllNumbersDisappearedinanArray fa = new FindAllNumbersDisappearedinanArray();
		fa.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length+1;
		
		int[] t = new int[n];
		
		for(int i:nums){
			t[i] = 1;
		}
		List<Integer> res = new ArrayList<Integer>();
		for(int i=1 ;i<t.length;i++){
			if(t[i] ==0){
				res.add(i);
			}
		}
		
		return res;
	}

}
