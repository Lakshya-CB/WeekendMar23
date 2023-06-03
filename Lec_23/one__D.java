package Lec_23;

public class one__D {
	public static void main(String[] args) {
		place(0, 2, 3, "");
	}

	public static void place(int curr, int toPlace,
			int total_seats, String path) {

		if(toPlace ==0) {//+ve BC
			System.out.println(path);
			return;
		}
		if(total_seats==curr) {//-ve BC
			return;
		}
		place(curr+1, toPlace-1, total_seats, path+"q"+curr);//in
		place(curr+1, toPlace, total_seats, path);//ex

	}
}
