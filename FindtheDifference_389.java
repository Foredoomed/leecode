
public class FindtheDifference_389 {

	public static void main(String[] args) {
		FindtheDifference_389 fd = new FindtheDifference_389();
		System.out.println(fd.findTheDifference("abcd", "abcde"));
	}

	public char findTheDifference(String s, String t) {
		char res = 0;
        for (char c : s.toCharArray()) res ^= c;
        for (char c : t.toCharArray()) res ^= c;
        return res;
	}

}
