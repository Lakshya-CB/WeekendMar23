package Lec_27;

public class finally_Demo {
	public static void main(String[] args) {
		System.out.println(fn());
	}
	private static int fn() {
		// TODO Auto-generated method stub

		try {
			return 10;
		}finally {
			return 100;
		}
	}
}
