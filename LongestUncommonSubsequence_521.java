
public class LongestUncommonSubsequence_521 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestUncommonSubsequence_521 lu = new LongestUncommonSubsequence_521();
		lu.findLUSlength("abcd", "abc");
	}

	public int findLUSlength(String a, String b) {
		if(a.equals(b)){
			return -1;
		}
		
		return Math.max(a.length(), b.length());
	}
}
