package Lec_05;

public class Q_8 {
	public static void main(String[] args) {
		int n = 15;
		int r = 1;
		int total_st = n;
		while (r <= n) {
			int cnt_st = 0;
			while (cnt_st < total_st) {
				if (r == cnt_st + 1 || r + cnt_st == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");

				}
				cnt_st++;
			}

			r++;
			System.out.println();
		}
	}
}
