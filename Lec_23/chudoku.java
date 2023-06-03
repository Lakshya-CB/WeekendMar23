package Lec_23;

public class chudoku {
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		System.out.println("Q==start");

		solve(0, 0, board);
		System.out.println("Q==end");
		print(board);

	}

	public static void print(char[][] board) {
		for (char[] r : board) {
			for (char b : r) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

	static boolean positive = false; 
	private static void solve(int r, int c, char[][] board) {
		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			print(board);
			System.out.println("=======");
			positive = true; 
			return;
		}
		if (board[r][c] != '.') {
			solve(r, c + 1, board);
		} else {
			for (char digit = '1'; digit <= '9'; digit++) {
				if (isSafe(r, c, digit, board)) {
					board[r][c] = digit;
					solve(r, c + 1, board);
					if(positive) {
						return;
					}
				}
			}
			board[r][c] = '.';
		}
	}

	private static boolean isSafe(int r, int c, char digit, char[][] board) {
		// TODO Auto-generated method stub
		for (int R = 0; R < 9; R++) {
			if (board[R][c] == digit) {
				return false;
			}
		}
		for (int C = 0; C < 9; C++) {
			if (board[r][C] == digit) {
				return false;
			}
		}
		int boxR = r / 3;
		int boxC = c / 3;
		for (int R = boxR * 3; R < boxR * 3 + 3; R++) {
			for (int C = boxC * 3; C < boxC * 3 + 3; C++) {
				if (board[R][C] == digit) {
					return false;
				}
			}
		}
		return true;
	}
}
