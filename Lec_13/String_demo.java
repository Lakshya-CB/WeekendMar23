package Lec_13;

public class String_demo {
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(str);
		System.out.println(str.charAt(1));

		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(str.charAt(str.length() - 1));

		str = "bdbabcbdbsa";
		System.out.println(">" + str.indexOf("bdb"));

		System.out.println(str.lastIndexOf("0"));

		System.out.println(str.startsWith("bd"));
		System.out.println(str.endsWith("?"));
		System.out.println("==============");
//		printPalinSS("aaaa");
		wordsRev("the sky is blue");
	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void printAllSS(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String ss = str.substring(s, e);
				if (isPalin(ss)) {
					System.out.println(ss);
				}
			}
		}
	}

	public static void printPalinSS(String str) {
		for (int c = 0; c < str.length(); c++) {
			grow(str, c, c);// odd
			grow(str, c, c + 1);// even

		}
	}

	public static void grow(String str, int L, int R) {
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
//				L to R is palin
				System.out.println(str.substring(L, R + 1));
				L--;
				R++;
			} else {
				return;
			}
		}
	}

	public static void wordsRev(String str) {
		while (true) {
			int f = str.lastIndexOf(" ");
			String word = str.substring(f + 1);
			System.out.println(word);
			if (f == -1) {
				break;
			}
			str = str.substring(0, f);
		}
	}
}
