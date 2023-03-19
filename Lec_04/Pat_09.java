package Lec_04;

public class Pat_09 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tots_st = 1;
		int tots_sp = n - 1;

		while (row <= n) {
//		space
			int cnt_sp = 0;
			while (cnt_sp < tots_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//		star!
			int cnt_st = 0;
			while (cnt_st < tots_st) {
				if (cnt_st % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("! ");
					
				}
				cnt_st++;
			}

			System.out.println();
			tots_st = tots_st + 2;
			tots_sp--;
			row++;
		}

	}
}
