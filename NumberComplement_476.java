
public class NumberComplement_476 {
	
	public static void main(String[] args) {
		NumberComplement_476 ni = new NumberComplement_476();
		int r = ni.findComplement(5);
		System.out.println(r);
	}
	
	
	public int findComplement(int num) {
        
		return ~num & (Integer.highestOneBit(num) - 1);
    }

}
