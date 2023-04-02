package Lec_08;

public class armstrong {
	public static void main(String[] args) {
		int n = 1000;
		printTill(n);
	}

	public static void printTill(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArm(num)) {
				System.out.println(num);
			}
		}

	}

	public static boolean isArm(int num) {
//		370
		int nod = numOfDigits(num); //3
		int ans = 0;
		int baaackup = num;
		while (num > 0) {
			int dogit = num % 10;
			ans = ans + (int)Math.pow(dogit, nod);
			num = num / 10;
		}
		if(ans==baaackup) {
			return true;
		}else {
			return false;
		}
	}

	public static int numOfDigits(int num) {
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		return nod;
	}
}
