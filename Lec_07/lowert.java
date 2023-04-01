package Lec_07;

public class lowert {
	public static void main(String[] args) {
		char ch = 'b';
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("upper");
		} else {
			System.out.println("kuch nui");
		}
	}
}
