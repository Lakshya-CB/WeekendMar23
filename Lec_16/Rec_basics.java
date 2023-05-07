package Lec_16;

public class Rec_basics {

	public static void main(String[] args) {
//		PI(5);
//		PD(5);
//		PD(1, 5);
		PID(1, 5);
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)
		PI(n - 1);
		System.out.println(n);
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
//		BP : PD(n)
//		SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}

	public static void PI(int s, int e) {
		if (s > e) {
			return;
		}
//		BP : PI(s,e)
//		SP : PI(s+1,e)
		System.out.println(s);
		PI(s + 1, e);
	}

	public static void PD(int s, int e) {
		if (s > e) {
			return;
		}
//		BP : PD(s,e)
//		SP : PD(s+1,e)
		PD(s + 1, e);
		System.out.println(s);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}

		// BP : PDI(n)
		// SP : PDI(n-1)
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int s, int e) {
		if(s>e) {
			return;
		}
//		BP : PID(s,e)
//		SP : PID(s+1,e)
		System.out.println(s);
		PID(s+1,e);
		System.out.println(s);
	}
}
