package Lec_11;

public class sooooorting {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 20, 100, 250, 90 };
//		int[] arr = { 10, 20, 30, 40, -3 };
		print(arr);
//		bubble(arr);
//		Selection(arr);
		Insertion(arr);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void bubble(int[] arr) {
		for (int cnt = 1; cnt < arr.length; cnt++) {
			for (int s = 0; s <= arr.length - 1 - cnt; s++) {
//			arr[s] , arr[s+1];
				if (arr[s] > arr[s + 1]) {
					int temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
			print(arr);

		}
	}

	public static void Selection(int[] arr) {
		for (int last = arr.length - 1; last >= 1; last--) {
			int max_ali_idx = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[max_ali_idx] < arr[i]) {
					max_ali_idx = i;
				}
			}
//		chwaaap
//		last with max_ali_idxl;
			int temp = arr[last];
			arr[last] = arr[max_ali_idx];
			arr[max_ali_idx] = temp;
		}
	}

	public static void Insertion(int[] arr) {
//		{10,20,30,40,-3}

		for (int toIns = 1; toIns <= arr.length - 1; toIns++) {
			int ali = arr[toIns];
			int idx = toIns - 1;
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = ali;
			print(arr);
			System.out.println("-=-=-=-=-=-");
		}

	}
}
