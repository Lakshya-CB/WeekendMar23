package Lec_03;

public class Digits_rev {
	public static void main(String[] args) {
		int num = 7243;
		int ans = 0;
		
		while (num>0) {
			int digit = num % 10;
			num = num / 10;
			ans = ans*10+digit;
		}
		System.out.println(ans);
	}
}
