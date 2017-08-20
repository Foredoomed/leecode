
public class ConstructtheRectangle_492 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructtheRectangle_492 cr = new ConstructtheRectangle_492();
		cr.constructRectangle(4);
	}

	public int[] constructRectangle(int area) {
		
		int d =(int) Math.sqrt(area);
		if(d*d == area){
			return new int[]{d,d};
		}
		
		while (area % d != 0) {
			d--;
		}
		
		return new int[]{area/d, d};
	}
}
