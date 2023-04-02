package Lec_08;

public class array_demo3 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int num = 2;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = num;
			num = num + 2;
		}
		int[] arr2 = arr1;
		arr2[0] = 99;
		System.out.println(arr1[0]);
	}
}
