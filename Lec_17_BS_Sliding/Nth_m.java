package Lec_17_BS_Sliding;

import java.util.Scanner;

public class Nth_m {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			T--;
			int N = scn.nextInt();
			int M = scn.nextInt();
//			System.out.println((int)Math.pow(M, 1.0 / N));
			double ans = Math.pow(M, 1.0 / N);
//			System.out.println(ans);
//			System.out.println(ans ==(int)ans);
			if (ans == (int) ans) {
//				System.out.println("int hein !!");
				System.out.println((int) ans);
			} else if (ans - (int) ans > 0.9999) {
				System.out.println((int) ans+1);
			} else {
				System.out.println(-1);
			}
		}
	}
}
