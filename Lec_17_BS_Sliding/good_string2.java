package Lec_17_BS_Sliding;

import java.util.Scanner;

public class good_string2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int len = 0;
		int ans = 0;
//		cbaeicde
//		M1
		int e = 0;
		for (int s = 0; s < str.length(); s++) {
			e = Math.max(s, e);
			for (; e < str.length(); e++) {
				if(isConso(str.charAt(e))) {
					break;
				}
				System.out.println(str.substring(s,e+1));
			}
		}
	}

	public static boolean isConso(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return false;
		}
		return true;
	}
}
