import java.util.HashMap;
import java.util.Map;

public class DistributeCandies_575 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistributeCandies_575 dc = new DistributeCandies_575();
		int[] candies = { 1, 1, 2, 2, 3, 3 };
		System.out.println(dc.distributeCandies(candies));
	}

	public int distributeCandies(int[] candies) {
		Map<Integer, Integer> res = new HashMap<Integer, Integer>();
		for (int i : candies) {
			if (res.size() == candies.length / 2) {
				return res.size();
			}

			res.put(i, 1);

		}
		return res.size();
	}
}
