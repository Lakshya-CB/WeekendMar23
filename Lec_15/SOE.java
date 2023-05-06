package Lec_15;

public class SOE {
// Sieve of eratosthesnes
	public static void main(String[] args) {
		prime(25);
	}
	public static void prime(int n) {
		boolean[] isComp = new boolean[n + 1];

		for (int div = 2; div * div <= n; div++) {
			if (isComp[div] == false) {
				for (int table = div * div; table <= n; table = table + div) {
					isComp[table] = true;
				}
			}
		}
		for(int num = 1;num<=n;num++) {
			if(isComp[num]==false) {
				System.out.println(num);
			}
		}
	}
}
