package Lec_09;

public class QPS_arrays {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		revPrint(arr);
		Rreverse(arr);
	}

	public static void revPrint(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int Max(int[] arr) {
//		int jeb = arr[0];
		int jeb = Integer.MIN_VALUE;

		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int Find(int[] arr, int ali) {
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx] == ali) {
				return idx;
			}
		}
		return -1;
	}

	public static void Rreverse(int[] arr) {
		int L = 0;
		int R = arr.length - 1;
		while (L<R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;

			L++;
			R--;
		}
	}

}
