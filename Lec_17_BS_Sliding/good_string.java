package Lec_17_BS_Sliding;

import java.util.Scanner;

public class good_string {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int len=0;
		int ans =0;
//		cbaeicde
//		M1
		for(int i=0;i<str.length();i++) {
			len++;
			if(isConso(str.charAt(i))) {
				len=0;
			}
			ans = Math.max(ans, len);
		}
	}
	public static boolean isConso(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return false;
		}
		return true;
	}
}
