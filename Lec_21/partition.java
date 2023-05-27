package Lec_21;

public class partition {
	public static void main(String[] args) {
		kaat("abc", "");
	}

	public static void kaat(String table, String bag) {
		if (table.isEmpty()) {
			System.out.println(bag);
			return;
		}
//		table= abcd , ""
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
//			if (isPalin(piece)) {
			String remain = table.substring(chakku);
//			System.out.println(piece+ " - "+remain);
			kaat(remain, bag + piece + "=");
//			}
		}
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

}
