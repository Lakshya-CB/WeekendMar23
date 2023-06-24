package Lec_28;

public class partitioning {
	public static void main(String[] args) {
		kaat("abc", "");
	}

	public static void kaat(String table, String bag) {
		if(table.isEmpty()) {
			System.out.println(bag);
			
		}
//		table =  "abcd"'
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			String remain = table.substring(chakku);
//			System.out.println(piece + " - " + table);
			kaat(remain, bag + "-"+piece);
		}
	}
}
