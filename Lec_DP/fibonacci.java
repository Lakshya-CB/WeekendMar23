package Lec_DP;

public class fibonacci {
	public static void main(String[] args) {
		int n = 10000;
//		System.out.println(FibTD(n, new Integer[n+1]));
		System.out.println(BU(5));
	}
	public static int Fib(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = Fib(n - 1);
		int sp2 = Fib(n - 2);
		return sp1 + sp2;
	}

//	Top Down approach, Memoization
	public static int FibTD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		int sp1 = FibTD(n - 1, dp);
		int sp2 = FibTD(n - 2, dp);
//		Fib(n) => dp[n]
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}
//	Bottoms up!! Tabulation
	public static int BU(int N) {
		int[] dp =new int[N+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int n = 2;n<=N;n++) {
//			dp[n]
			int sp1 = dp[n-1];
			int sp2 = dp[n-2];
//			Fib(n) => dp[n]
			dp[n] = sp1 + sp2;
		}
		return dp[N];
	}
}
