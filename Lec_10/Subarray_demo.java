package Lec_10;

public class Subarray_demo {
	public static void main(String[] args) {
		int[] arr = { 10, 25, -30, 40 };
//		M1(arr);
//		System.out.println("========");
		M2(arr);
	}

	public static void M1(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
				int sum = 0;
				for (int i = s; i <= e; i++) {
//					System.out.print(arr[i]+" ");
					sum = sum + arr[i];
				}
				System.out.println("=>" + sum);

			}
		}
	}

	public static void M2(int[] arr) {
		int ans = 0;
		for (int s = 0; s < arr.length; s++) {
			int sum = 0; // B
			for (int e = s; e < arr.length; e++) {
				sum = sum + arr[e];
				if(sum>ans) {
					ans = sum;
				}
				System.out.println("=>" + sum);
			}
		}
		System.out.println("ans is"+ans);
	}
}
