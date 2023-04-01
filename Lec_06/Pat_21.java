package Lec_06;

public class Pat_21 {
	public static void main(String[] args) {
		int n = 5;
		int r = 1;
		int tots_st = 1;
		int tots_sp = 2 * n - 3;

		while (r <= n) {
			int cnt_st1 = 0;
			while (cnt_st1 < tots_st) {
				System.out.print("* ");
				cnt_st1++;
			}

			int cnt_sp = 0;
			while (cnt_sp < tots_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			
			int cnt_st2 = 0;
			if(r==n) {
//				tots_st--; //A
				cnt_st2=1; //B
			}
			while (cnt_st2 < tots_st) {
				System.out.print("* ");
				cnt_st2++;
			}
			System.out.println();
			r++;
			tots_st++;
			tots_sp = tots_sp - 2;
		}
	}
}
