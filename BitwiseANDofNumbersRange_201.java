
public class BitwiseANDofNumbersRange_201 {

	public int rangeBitwiseAnd(int m, int n) {
		//Brian Kernighan's Algorithm
		
		while (n > m)
		    n &= (n-1);
		return n;
	}

}
