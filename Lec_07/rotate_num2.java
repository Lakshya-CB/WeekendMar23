package Lec_07;

public class rotate_num2 {
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
		int mult = (int) Math.pow(10, rot);
		int p1 = n/mult;
		int p2 = n%mult;
//		System.out.println(p1+ " - "+p2);
		int mult2 = (int)Math.pow(10,nod-rot);
		System.out.println(p1+p2*mult2);
		
	}
}
