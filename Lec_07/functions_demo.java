package Lec_07;

public class functions_demo {
	public static void main(String[] args) {
		naacho();
		int ali = add(10, 20, 30);
		System.out.println(ali);
	}

	public static void naacho() {
		System.out.println("naaach!!");
	}

	public static int add(int a, int b, int c) {
//		System.out.println(a + b + c);
		return a+b+c;
	}
}
