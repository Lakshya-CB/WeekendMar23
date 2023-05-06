package Lec_15;

public class dookha {
	public static void main(String[] args) {
		int n = 100_000;
		long start = System.currentTimeMillis();

		String str = "";
		StringBuilder sb = new StringBuilder(str);
		int sum =0;
		for (int i = 0; i < n; i++) {
//			str = str + i; //O(n)
			sb.append(i);
//			sum = sum+i; //O(1)
		}
		str = sb+"";
		long end = System.currentTimeMillis();

		System.out.println((end - start) / 1000.0);
	}

}
