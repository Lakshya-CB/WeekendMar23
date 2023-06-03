package Lec_23;

public class two_D2 {
	public static void main(String[] args) {
//		place(0, 2, 3, "");
		int n = 4;
		place(0, 0, n, new boolean[n][n], "");
	}

	public static void print(boolean[][] board) {
		for (boolean[] r : board) {
			for (boolean b : r) {
				if (b) {
					System.out.print("+");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}

	public static void place(int r, int c, int toPlace, boolean[][] board, String path) {
		if (toPlace == 0) {
			System.out.println(path);
			print(board);
			System.out.println("===============");
			return;
		}

		if (c == board[0].length) {
			c = 0;
			r++;
		}
		if (r == board.length) {// -ve BC
			return;
		}
		if (isSafe(r, c, board)) {
			board[r][c] = true;
			place(r, c + 1, toPlace - 1, board, path + "q{" + r + "," + c + "}");// Inc
			board[r][c] = false;
		}
		place(r, c + 1, toPlace, board, path);// Ex

	}

	private static boolean isSafe(int r, int c, boolean[][] board) {
		for (int C = 0; C < c; C++) {
			if (board[r][C]) {
				return false;
			}
		}
		for (int R = 0; R < r; R++) {
			if (board[R][c]) {
				return false;
			}
		}
		int C = c;
		int R = r;
		while(R>=0 && C>=0) {
			if(board[R][C]) {
				return false;
			}
			R--;
			C--;
		}
		C = c;
		R = r;
		while(R>=0 && C<board[0].length) {
			if(board[R][C]) {
				return false;
			}
			R--;
			C++;
		}

		return true;
	}
}
