package Lec_08;

public class functions_demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println("start mein ?"+functions_demo_3.val);
		fun(20);
		System.out.println("lasst mein "+functions_demo_3.val);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(functions_demo_3.val);
		val = val + 60;
		functions_demo_3.val = val + 10;
		System.out.println(val);
		System.out.println(functions_demo_3.val);
	}

}
