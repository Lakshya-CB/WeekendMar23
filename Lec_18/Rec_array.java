package Lec_18;

public class Rec_array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		print(0, arr);

		printInterval(0, arr.length - 1, arr);
	}

	public static void print(int s, int[] arr) {
		if (s == arr.length) {
			return;
		}
//	BP : print(s,arr)
//	SP : print(s+1,1arr)
		System.out.println(arr[s]);
		print(s + 1, arr);
	}

	public static void printInterval(int s, int e, int[] arr) {
		if (s > e) {
			return;
		}
		int mid = (s + e) / 2;
		printInterval(s, mid - 1, arr);
		System.out.println(arr[mid]);
		printInterval(mid + 1, e, arr);
	}

	public static void printRev(int s, int[] arr) {
//		BP : printRev(s,arr)
//		Sp : printRev(s+1)
		if (s == arr.length) {
			return;
		}
		printRev(s + 1, arr);
		System.out.println(arr[s]);
	}

	public static int Max(int s, int[] arr) {
//	 BP: Max(0,arr)
//	Sp : Max(1,arr)
//		{2,4,7,1};
		if (s == arr.length - 1) {
			return arr[s];
		}
//		if(s==arr.length) {
////			return Integer.MIN_VALUE;
//			return arr[0];
//		}
		int sp = Max(s + 1, arr);

		return Math.max(arr[s], sp);
	}

	public static int FirstOCc(int s, int ali, int[] arr) {
//		{5,6,5,6,7}
		if (s == arr.length) {
			return -1;
		}
		int sp = FirstOCc(s + 1, ali, arr);
		if (arr[s] == ali) {
			return s;
		}
		return sp;
	}

	public static int LastOCc(int s, int ali, int[] arr) {
//		{5,6,5,6,7}
		if (s == arr.length) {
			return -1;
		}
		int sp = LastOCc(s + 1, ali, arr);
		if (sp == -1 && arr[s] == ali) {
			return s;
		}
		return sp;
	}
}
