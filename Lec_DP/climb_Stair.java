package Lec_DP;

public class climb_Stair {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solve(0, n));
	}

	public static int solve(int curr, int n) {
		if (n == curr) {
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		int sp1 = solve(curr + 1, n);
		int sp2 = solve(curr + 2, n);

		return sp1 + sp2;
	}

//	Top Down
	public static int solve(int curr, int n, Integer[] dp) {
		if (n == curr) {
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		if (dp[curr] != null) {
			return dp[curr];
		}
		int sp1 = solve(curr + 1, n, dp);
		int sp2 = solve(curr + 2, n, dp);
//		solve(curr)=>dp[curr]!
		dp[curr] = sp1 + sp2;

		return sp1 + sp2;
	}

	public static int BU(int N) {
		int[] dp = new int[N + 2];
		for (int curr = N; curr >= 0; curr--) {
			if(curr==N) {
				dp[curr]=1;
				continue;
			}
//			dp[curr]!!
			int sp1 = dp[curr + 1];
			int sp2 = dp[curr + 2];
//			solve(curr)=>dp[curr]!
			dp[curr] = sp1 + sp2;
		}
		return dp[0];

	}

}
