import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordPattern_290 wp = new WordPattern_290();
		System.out.println(wp.wordPattern("abaa","dog cat cat dog"));
	}

	public boolean wordPattern(String pattern, String str) {
		String[] s = str.split(" ");
		if(pattern.length() != s.length){
			return false;
		}
		
		Map m = new HashMap();
		for(int i=0; i<s.length; i++){
			if(m.put(pattern.charAt(i), i) != m.put(s[i], i))
				return false;
		}
		
		return true;
	}

}
