import java.util.HashMap;
import java.util.Map;

public class FindtheDuplicateNumber_287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindtheDuplicateNumber_287 fd = new FindtheDuplicateNumber_287();
		System.out.println(fd.findDuplicate(new int[] { 1, 2, 3, 4, 3 }));
	}

	public int findDuplicate(int[] nums) {
		Map m = new HashMap();
		for(int i=0;i<nums.length;i++){
			if(m.get(nums[i]) ==null){
				m.put(nums[i], true);
			}else{
				return nums[i];
			}
		}
		
		return -1;
	}

}
