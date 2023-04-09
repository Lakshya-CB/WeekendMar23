package Lec_10;

public class Kadace_algo {
	public static void main(String[] args) {
//		int[] arr = { 10, -5, 2, -6, 50, -60, 5, -1, 40, -2, 40 };
		int[] arr = { -1, -2, -1, -3, -10 };

		System.out.println(MaxSubarraySum(arr));
	}

	public static int MaxSubarraySum(int[] arr) {
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		for (int ali : arr) {
			sum = sum + ali;
			
			ans = Math.max(sum, ans);
			sum = Math.max(sum, 0);
		}
		return ans;
	}
}
