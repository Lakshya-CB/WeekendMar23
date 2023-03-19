package Lec_04;

public class Pat_02 {
	public static void main(String[] args) {
		int n = 5;
		
		int row =1;
		int tots_st =1;
		while(row<=n) {
//			
			int cnt_st = 0;
			while(cnt_st<tots_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
//			
			row++;
			System.out.println();
			tots_st++;
		}
	}
}
