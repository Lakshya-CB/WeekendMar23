package Lec_20;

public class Subseq {
	public static void main(String[] args) {
		SS("abc", "");
	}

	public static void SS(String str, String team) {
		if (str.isEmpty()) {
			System.out.println(team+"=>");
			return;
		}
//		SS("abc","")
		char ch = str.charAt(0);
		String remain = str.substring(1); // "bc"
		SS(remain, team + ch);// Inc
		SS(remain, team);// Ex
	}
}
