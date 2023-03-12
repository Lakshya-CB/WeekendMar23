package Lec_02;

public class Prime {
	public static void main(String[] args) {
		int N = 13;
		int divisor = 1;
		int numFac = 0;
		while (divisor <= N) {
			int rem = N % divisor;
			if (rem == 0) {
				numFac = numFac + 1;
				divisor = divisor + 1;
			}
		}
//		System.out.println(numFac);
		if (numFac == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Composite");
		}
	}
}
