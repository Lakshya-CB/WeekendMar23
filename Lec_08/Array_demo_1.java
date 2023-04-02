package Lec_08;

public class Array_demo_1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
		
//		length!!
		System.out.println(arr.length);
//		arr ka ith element ????how to get it ?
//		indexing!!
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		System.out.println(arr[-1]);
		
//		int aloi = arr[0];
//		System.out.println(aloi);
//		ith element ki value set karni hein?!
		System.out.println("==========");
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
	}
}
