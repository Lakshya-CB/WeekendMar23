package Lec_23;

public class two_D {
	public static void main(String[] args) {
//		place(0, 2, 3, "");
		int n =4;
		place(0, 0, n, n, n, "");
	}

	public static void place(int r, int c, int toPlace, 
			int total_R,int total_C, String path) {
		if(toPlace==0) {
			System.out.println(path);
			return;
		}
		
		if(c==total_C) {
			c=0;
			r++;
		}
		if(r==total_R) {//-ve BC
			return;
		}
		place(r, c+1, toPlace-1, total_R, total_C,
				path+"q{"+r+","+c+"}");// Inc

		place(r, c+1, toPlace, total_R, total_C, path);// Ex
		
	}
}
