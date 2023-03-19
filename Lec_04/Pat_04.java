package Lec_04;

public class Pat_04 {
	public static void main(String[] args) {
		int n =5;
		int row = 1;
		int tots_sp = n-1;
		int tots_st =1;
		while(row<=n) {
			
//			space print kari!!
			int cnt_sp =0;
			while(cnt_sp <tots_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//			Star print kar chal!!
			int cnt_st =0;
			while(cnt_st <tots_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			System.out.println();
			tots_st++;
			tots_sp--;
			row++;
		}
	}
}
