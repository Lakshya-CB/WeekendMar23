package Lec_01;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int num = 2131225;
		int num = scn.nextInt();
		int rem = num % 2;
		if (rem == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
