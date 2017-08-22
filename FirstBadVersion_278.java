
public class FirstBadVersion_278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstBadVersion_278 fb = new FirstBadVersion_278();
		fb.firstBadVersion(n)
				
	}

	public int firstBadVersion(int n) {
		int start = 1, end = n;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (!isBadVersion(mid))
				start = mid + 1;
			else
				end = mid;
		}
		return start;
	}
}
