
public class HammingDistance_461 {

	public static void main(String[] args){
		HammingDistance_461 hd = new HammingDistance_461();
		int r = hd.hammingDistance(1, 4);
		System.out.println(r);
	}

	int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);  
	}
}
