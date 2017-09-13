
public class ValidPalindrome_125 {

	public static void main(String[] args) {
		ValidPalindrome_125 vp = new ValidPalindrome_125();
		System.out.println(vp.isPalindrome(""));
	}

	public boolean isPalindrome(String s) {
		String regex = "([^A-Za-z0-9])";

		s = s.replaceAll(regex, "");
		for(int i =0;i<s.length()/2;i++){
			if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(s.length()-1-i)))
				continue;
			else 
				return false;
		}
		return true;
	}

}
