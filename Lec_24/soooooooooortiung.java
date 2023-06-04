package Lec_24;

import java.util.Arrays;

public class soooooooooortiung {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 11, 12, 300, 1400, 2000 };
		System.out.println(Arrays.toString(merge(arr1, arr2)));

	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[idx3] = arr1[idx1];
				idx1++;
				idx3++;
			} else {
				ans[idx3] = arr2[idx2];
				idx2++;
				idx3++;
			}
		}
		while (idx1 < arr1.length) {
			ans[idx3] = arr1[idx1];
			idx1++;
			idx3++;
		}
		while (idx2 < arr2.length) {
			ans[idx3] = arr2[idx2];
			idx2++;
			idx3++;
		}

		return ans;
	}

	public static int[] soort(int[] arr, int s, int e) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int[] sp1 = soort(arr, s, mid);
		int[] sp2 = soort(arr, mid + 1, e);
		return merge(sp1, sp2);
	}
}
