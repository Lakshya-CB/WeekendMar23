package Lec_09;

public class Rotate2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		suvle(arr, -23);
//		print(arr);
	}

	public static void print(int[] arr) {
		for (int alio : arr) {
			System.out.print(alio + " ");
		}
		System.out.println();
	}

	public static void suvle(int[] arr, int rot) {
		rot = rot % arr.length;
		if (rot < 0) {
			rot = rot + arr.length;
		}
		Rev(arr, 0, arr.length - 1);
		print(arr);
		Rev(arr, 0, rot - 1);
		print(arr);

		Rev(arr, rot, arr.length - 1);
		print(arr);

	}

	public static void Rev(int[] arr, int L, int R) {

		while (L < R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;

			L++;
			R--;
		}
	}
}
