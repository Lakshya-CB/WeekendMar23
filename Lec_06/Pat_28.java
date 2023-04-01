package Lec_06;

public class Pat_28 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tots_st = 1;
		int tots_sp = n - 1;
		int row_start_number = 1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < tots_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//			###########333
			int num = row_start_number;
			int cnt_st = 0;
			while (cnt_st < tots_st) {
				System.out.print(num + " ");
				if (cnt_st < tots_st / 2) {
					num++;
				} else {
					num--;	
				}
				cnt_st++;
			}
//##############
			System.out.println();
			tots_st = tots_st + 2;
			tots_sp--;
			row_start_number++;
			row++;
		}
	}
}
