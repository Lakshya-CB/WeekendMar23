package Lec_08;

public class array_2 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int num = 2;
		for(int i=0;i<arr.length;i++) {
			arr[i] = num;
			num=num+10;
		}
		System.out.println("==============");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("==============");
//		enhanced!!
		for(int ali : arr) {
//			System.out.println(ali);
			arr[2] = 99;
			ali = 99;
		}
		
		for(int ali : arr) {
			System.out.println(ali);
		}
		
		
	}
}
