package Lec_19;

public class Rec_basics {
	public static void main(String[] args) {
//		System.out.println(Fac(4));
//		System.out.println(pow(2, 4));
		System.out.println(Fibo(3));
	}

	public static int Fac(int n) {
		if (n == 0) {
			return 1;
		}
//	BP : Fac(n)
//	SP : Fac(n-1)
		int sp = Fac(n - 1);
		return sp * n;
	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
		int sp = pow(a, b - 1);
		return sp * a;
	}

	public static int Fibo(int n) {
//	BP : Fibo(n)
//	SP : Fibo(n-1) and Fibo(n-2)
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}
}
