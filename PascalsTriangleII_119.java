import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII_119 {

	public static void main(String[] args) {
		PascalsTriangleII_119 pt = new PascalsTriangleII_119();
		System.out.println(pt.getRow(3));
	}

	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < rowIndex + 1; i++) {
			res.add(1);
			for (int j = i - 1; j > 0; j--) {
				res.set(j, res.get(j - 1) + res.get(j));
			}
		}
		return res;
	}

}
