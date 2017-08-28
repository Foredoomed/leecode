import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SummaryRanges_228 sr = new SummaryRanges_228();
		sr.summaryRanges(new int[]{0,1,2,4,5,7});
	}

	public List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<String>();
		if(nums==null || nums.length==0 ){
			return res;
		}
		
		if(nums.length==1){
			res.add(String.valueOf(nums[0]));
			return res;
		}
		
		
		int a = nums[0], b=nums[0];
		for(int i=1 ;i<nums.length;i++){
			if(nums[i] - nums[i-1] == 1){
				b = nums[i];
			}else{
				if(a==b){
					res.add(String.valueOf(a) );
				}else{
					res.add(String.valueOf(a) + "->" + String.valueOf(b));
				}
				a=nums[i];
				b=nums[i];
			}
		}
		
		if(a==b){
			res.add(String.valueOf(a) );
		}else{
			res.add(String.valueOf(a) + "->" + String.valueOf(b));
		}
		
		return res;
	}

}
