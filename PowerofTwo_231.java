
public class PowerofTwo_231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerofTwo_231 pt = new PowerofTwo_231();
		System.out.println(pt.isPowerOfTwo(16));
	}
	
	public boolean isPowerOfTwo(int n) {
        while(n>1){
        	
        	if(n%2 !=0)
        		return false;
        	else
        	n=n/2;
        }
        
        return n==1;
    }

}
//
//if(n<=0) return false;
//return !(n&(n-1));