import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz_412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz_412 fb = new FizzBuzz_412();
		List<String> s = fb.fizzBuzz(15);
		System.out.println(Arrays.asList(s));
	}
	
	
public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<String>();
        for(int i=1;i<=n;i++){
        	if(i%3==0&&i%5==0){
        		res.add("FizzBuzz");
        		continue;
        	}else if(i%5==0){
        		res.add("Buzz");
        		continue;
        	}else if(i%3==0){
        		res.add("Fizz");
        		continue;
        	}else{
        		res.add(i+"");
        	}
        }
        
        return res;
    }
}
