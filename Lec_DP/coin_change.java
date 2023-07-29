package Lec_DP;

public class coin_change {
	public static void main(String[] args) {
		int Amount = 5;
		int[] coins = { 1, 2, 3 };
//		solve(Amount, 0, "", coins);
		System.out.println(solve(Amount, 0, coins));
	}

	public static void solve(int A, int idx, String path, int[] coins) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0 || idx == coins.length) {
			return;
		}

		solve(A - coins[idx], idx, path + coins[idx], coins);
		solve(A, idx + 1, path, coins);

	}

	public static int solve(int A, int idx, int[] coins) {
		if (A == 0) {
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}

		int sp1 = solve(A - coins[idx], idx, coins);
		int sp2 = solve(A, idx + 1, coins);
		return sp1 + sp2;

	}
	
	
	
	
	
	
	
	
	
	 
}
