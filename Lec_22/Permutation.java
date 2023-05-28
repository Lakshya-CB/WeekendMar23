package Lec_22;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		int total_boxes = 4;
		int r = 2;
//		solve(r, total_boxes, new boolean[total_boxes], "");
		solve_PT(r, total_boxes, -1, "");
	}

	public static void solve(int r, int total_boxes, boolean[] picked, String path) {
//		BP  : SOlve(3)
		if (r == 0) {
			System.out.println(path);
			System.out.println(Arrays.toString(picked));
			System.out.println("============");
			return;
		}
		for (int curr = 0; curr < total_boxes; curr++) {
//			curr = 2;
			if (picked[curr] == false) {
				picked[curr] = true;
				solve(r - 1, total_boxes, picked, path + "b" + curr);
				picked[curr] = false;// explicit backtracking
			}
		}
	}

	public static void solve_PT(int r, int total_boxes, int prev, String path) {
		if(r==0) {
			System.out.println(path);
			return;
		}
		for (int curr = prev + 1; curr < total_boxes; curr++) {
//			curr box = 2
			solve_PT(r-1, total_boxes, curr, path +"b"+curr);
		}
	}
}
