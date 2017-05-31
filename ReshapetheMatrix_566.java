
public class ReshapetheMatrix_566 {
	
	
	public static void main(String[] args) {
		ReshapetheMatrix_566 c = new ReshapetheMatrix_566();
		int[][] r = c.matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4);
		System.out.println(r);
	}

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int m = nums.length;
		int n = nums[0].length;
		
		if(m*n!=r*c){
			return nums;
		}
		
		int row=0, col=0;
		int[][] re = new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				re[row][col] = nums[i][j];
				col++;
				if(col==c){
					col=0;
					row++;
				}
			}
		}
		
		return re;
	}

}
