
public class MaxConsecutiveOnes_485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConsecutiveOnes_485 mc = new MaxConsecutiveOnes_485();
		int[] nums = {1,1,0,1,1,1};
		mc.findMaxConsecutiveOnes(nums);
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		
		int n = 0;
		int t = 0;
		for(int i=0;i<nums.length;i++){
			
			if(nums[i] ==1){
				t++;
			}else{
				if(t>n){
					n=t;
				}
				t=0;
			}
			
		}
		if(t>n){
			n=t;
		}
		return n;
	}

}
