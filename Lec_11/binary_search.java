package Lec_11;

public class binary_search {
	public static void main(String[] args) {
		int[] arr = { -99, -1,0, 5, 10, 15, 20, 25, 30, 35, 100, 150, 151 };

	}

	public static int find(int[] arr, int ali) {
		int s = 0;
		int e = arr.length - 1;
		while (s<=e) {
			int mid = (s+e)/2;
			if(arr[mid]==ali) {
				return mid;
			}else if(ali<arr[mid]) {
				e = mid-1;
			}else {
				s = mid+1;
			}
		}
		return -1;
	}
}
