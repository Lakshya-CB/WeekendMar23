package Lec_06;

import java.util.Scanner;

public class replace_them_all {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		long mult = 1;
		long ans = 0;
		while (num > 0) {
			int digit = (int) (num % 10);
			num = num / 10;
			if (digit == 0) {
				digit = 5;
			}
			ans = ans + digit * mult;
			System.out.println(digit+ "- "+mult);
			mult = mult * 10;
		}
		if(ans==0) {
			ans = 5;
		}
		System.out.println(ans);

	}
}
