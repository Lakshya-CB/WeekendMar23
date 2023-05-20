package Lec_17_BS_Sliding;

import java.util.Scanner;


public class murthal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int totalP = scn.nextInt();
		int[] cooks = new int[scn.nextInt()];
		for (int i = 0; i < cooks.length; i++) {
			cooks[i] = scn.nextInt();
		}
		int minTime = 0;
		int maxTime 
		= (2 * cooks[0] + (totalP - 1) * cooks[0]) * totalP / 2;
//		System.out.println(minTime + " - "+maxTime);
//		for(int time = minTime;time<=maxTime;time++) {
//			System.out.println(time + " - "+isPoss(time, totalP, cooks));
//		}
		int s = minTime;
		int e = maxTime;
		int ans = e;
		while (s <= e) {
			int time = (s + e) / 2;
			if (isPoss(time, totalP, cooks)) {
				ans = time;
				e = time - 1;
			} else {
				s = time + 1;
			}
		}
		System.out.println(ans);
	}

	public static boolean isPoss(int time, int total, int[] cooks) {

		int currP = 0;
		for (int R : cooks) {
			int cooked = 0;
			int curr_time = 0;
			int temp = 1;
			while (true) {
				curr_time = curr_time + temp * R;
				if (curr_time > time) {
					break;
				}
				temp++;
				cooked++;
//				System.out.println(curr_time + " - "+cooked);
			}
			currP = currP + cooked;
		}
		return currP >= total;
	}
}
