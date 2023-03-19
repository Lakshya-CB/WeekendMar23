package Lec_04;

public class Pat_05 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tots_st = n;
		int tots_sp = 0;

		while (row <= n) {
//			space
			int cnt_sp = 0;
			while (cnt_sp < tots_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//			star!
			int cnt_st = 0;
			while (cnt_st < tots_st) {
				System.out.print("* ");
				cnt_st++;
			}

			System.out.println();
			tots_st--;
			tots_sp = tots_sp+2;
			row++;
		}
	}
}
