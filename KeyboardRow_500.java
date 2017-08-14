import java.util.ArrayList;
import java.util.List;

public class KeyboardRow_500 {
	
	String row1 = "qwertyuiopQWERTYUIOP";
    String row2 = "asdfghjklASDFGHJKL";
    String row3 = "zxcvbnmZXCVBNM";
	
	public  static void main(String[] args){
		String[] input = {"Hello", "Alaska", "Dad", "Peace"};
		KeyboardRow_500 kr = new KeyboardRow_500();
		String[] res = kr.findWords(input);
		for(String s:res)
		System.out.println(s);
	}
	
	public String[] findWords(String[] words) {
		List<String> res = new ArrayList<String>();
        for(String word:words){
        	
        	char first = word.charAt(0);
        	if(row1.indexOf(first) >=0){
        		boolean b = find1(word);
        		if(!b){
        			continue;
        		}
        	}
            
            
        	if(row2.indexOf(first) >=0){
        		boolean b = find2(word);
        		if(!b){
        			continue;
        		}
        	}
            
        	if(row3.indexOf(first) >=0){
        		boolean b = find3(word);
        		if(!b){
        			continue;
        		}
        	}
           
            
           res.add(word);
           
        }
        
        return res.toArray(new String[res.size()]);
    }
	
	public boolean find1(String str){
		for(char ch : str.toCharArray()){
			int i = row1.indexOf(ch);
			if(i >=0){
	        	return find1(str.substring(str.indexOf(ch)+1));
	        }else{
	        	return false;
	        }
        }
		return true;
	}
	public boolean find2(String str){
		for(char ch : str.toCharArray()){
			int i = row2.indexOf(ch);
			if(i >=0){
	        	return find2(str.substring(str.indexOf(ch)+1));
	        }else{
	        	return false;
	        }
        }
		return true;
	}
	public boolean find3(String str){
		for(char ch : str.toCharArray()){
			int i = row3.indexOf(ch);
			if(i >=0){
	        	return find3(str.substring(str.indexOf(ch)+1));
	        }else{
	        	return false;
	        }
        }
		return true;
	}
}
