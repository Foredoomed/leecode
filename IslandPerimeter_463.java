
public class IslandPerimeter_463 {

	public static void main(String[] args) {
		IslandPerimeter_463 ip = new IslandPerimeter_463();
		int[][] grid = {{0,1,0,0},
		                {1,1,1,0},
		                {0,1,0,0},
		                {1,1,0,0}};
		System.out.println(ip.islandPerimeter(grid));

	}

	public int islandPerimeter(int[][] grid) {
		if (grid==null || grid.length==0) return 0;
        int res = 0, m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 0) continue;
                res += 4;
                if (i > 0 && grid[i - 1][j] == 1) res -= 2;
                if (j > 0 && grid[i][j - 1] == 1) res -= 2;
            }
        }
        return res;
	}
}
