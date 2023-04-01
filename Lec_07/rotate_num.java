package Lec_07;

public class rotate_num {
	public static void main(String[] args) {
		int n = 12345;
		int rot = 33;

		int baaackup = n;
		int nod = 0;
		while (n > 0) {
			n = n / 10;
			nod++;
		}
		rot = rot % nod;
		n = baaackup;

		//////////////////
		for (int r = 1; r <= rot; r++) {
			int dogit = n % 10;
			int rem = n / 10;
//			System.out.println(dogit + " - " + rem);
//		System.out.println(nod);
			int mult = (int) Math.pow(10, nod - 1);
//			System.out.println(mult);
			n = dogit * mult + rem;
			System.out.println(n);
		}
	}
}
