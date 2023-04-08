package Lec_09;

public class Rotate {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		suvle(arr,3);
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
		if(rot<0) {
			rot=rot+arr.length;
		}
		for (int r = 1; r <= rot; r++) {
			int jeeb = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = jeeb;
			print(arr);
		}
		
	}
	
}
