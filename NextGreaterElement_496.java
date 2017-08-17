
public class NextGreaterElement_496 {
	
	
	public static void main(String[] args) {
		NextGreaterElement_496 ng = new NextGreaterElement_496();
		int[] a = {4,1,2};
		int[] b= {1,3,4,2};
		System.out.println(ng.nextGreaterElement(a, b));
	}
	

	public int[] nextGreaterElement(int[] findNums, int[] nums) {

		
		int[] res = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            res[i] = -1;
            boolean canFind = false;
            for (int key : nums) {
                if (key == findNums[i]) {
                    canFind = true;
                }
                if (canFind && key > findNums[i]) {
                    res[i] = key;
                    break;
                }
            }
        }

        return res;
	}

}
