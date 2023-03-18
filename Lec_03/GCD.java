package Lec_03;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		int n1 = snc.nextInt();
		int n2 = snc.nextInt();

		int dividend = n2;
		int divisor = n1;
		int rem = 1000;
		while (rem>0) {
			rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
