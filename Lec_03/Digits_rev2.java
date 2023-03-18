package Lec_03;

public class Digits_rev2 {
	public static void main(String[] args) {
		int num = 7243;
		while (num>0) {

			int digit = num % 10;
			num = num / 10;
			System.out.print(digit);
		}
//		System.out.println(digit);

	}
}
