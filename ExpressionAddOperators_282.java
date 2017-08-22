import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators_282 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressionAddOperators_282 ea = new ExpressionAddOperators_282();
		ea.addOperators("123", 6);
	}

	List<String> res = new ArrayList<String>();

	public List<String> addOperators(String num, int target) {
		dfs(num, target, "", 0, 0);
		return res;
	}

	public void dfs(String num, int target, String tmp, long curr, long prev) {
		if (curr == target && num.length() == 0) {
			res.add(String.valueOf(tmp));
			return;
		}

		for (int i = 1; i <= num.length(); i++) {
			String ss = num.substring(0, i);

			if (ss.length() > 1 && ss.charAt(0) == '0') {
				return;
			}

			long cn = Long.valueOf(ss);

			String next = num.substring(i);

			if (tmp.length() != 0) {
				dfs(next, target, tmp + "*" + cn, (curr - prev) + prev * cn, cn * prev);
				dfs(next, target, tmp + "+" + cn, curr + cn, cn);
				dfs(next, target, tmp + "-" + cn, curr - cn, -cn);
			} else {
				dfs(next, target, ss, cn, cn);
			}
		}
	}

}
