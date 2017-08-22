
public class SingleNumberIII_260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumberIII_260 sn = new SingleNumberIII_260();
		System.out.println(sn.singleNumber(new int[] { 1, 2, 1, 3, 2, 5 }));
	}

	public int[] singleNumber(int[] nums) {

		int diff = 0;
		for (int num : nums) {
			diff ^= num;
		}

		diff &= -diff;

		int[] rets = { 0, 0 };
		for (int num : nums) {
			if ((num & diff) == 0) {
				rets[0] ^= num;
			} else {
				rets[1] ^= num;
			}
		}
		return rets;
	}
}
