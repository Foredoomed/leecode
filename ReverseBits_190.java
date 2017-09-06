
public class ReverseBits_190 {
	
	
	public static void main(String[] args) {
		ReverseBits_190 rb = new ReverseBits_190();
		System.out.println(rb.reverseBits(9));
	}
	
	public int reverseBits(int n) {
		int m = 0;
	    for (int i = 0; i < 32; i++, n >>= 1) {
	        m <<= 1;
	        m |= n & 1;
	    }
	    return m;
	}

}
