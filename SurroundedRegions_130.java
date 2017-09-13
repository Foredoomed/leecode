import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions_130 {

	char[][] board;
	int row;
	int col;
	Queue<Integer> queue = new LinkedList<Integer>();

	public void solve(char[][] board) {
		this.board = board;
		row = board.length;
		if (row < 3)
			return;
		col = board[0].length;
		if (col < 3)
			return;

		// traverse first column and last column
		for (int i = 0; i < row; i++) {
			bfs(i, 0);
			bfs(i, col - 1);
		}

		// traverse first row and last row
		for (int j = 0; j < col; j++) {
			bfs(0, j);
			bfs(row - 1, j);
		}

		// change 'O' to 'X', restore '#' to 'O'
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (board[i][j] == 'O') {
					board[i][j] = 'X';
				} else if (board[i][j] == '#') {
					board[i][j] = 'O';
				}
			}
		}
	}

	public void bfs(int i, int j) {
		fill(i, j);
		while (!queue.isEmpty()) {
			int pos = queue.poll();
			int x = pos / col;
			int y = pos % col;

			fill(x - 1, y);
			fill(x + 1, y);
			fill(x, y - 1);
			fill(x, y + 1);
		}
	}

	public void fill(int i, int j) {
		if (i < 0 || j < 0 || i > row - 1 || j > col - 1)
			return;
		if (board[i][j] != 'O')
			return;
		queue.offer(i * col + j);
		board[i][j] = '#';
	}

}
