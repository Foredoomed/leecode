
public class RansomNote_383 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RansomNote_383 rn = new RansomNote_383();
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] res = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
        	res[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--res[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
	}
}
