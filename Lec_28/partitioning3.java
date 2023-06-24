package Lec_28;

import java.util.ArrayList;

public class partitioning3 {
	public static void main(String[] args) {
		kaat("dcabbacd", "", new ArrayList<>());
	}

	public static void kaat(String table, String bag, ArrayList<String> AL_bag) {
		if (table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("===============");

		}
//		table =  "abcd"'
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			if (isPalin(piece)) {
				String remain = table.substring(chakku);
//			System.out.println(piece + " - " + table);
				AL_bag.add(piece);
				kaat(remain, bag + "-" + piece, AL_bag);
				AL_bag.remove(AL_bag.size() - 1); // Explicit backtracking
			}
		}
	}

	private static boolean isPalin(String piece) {
		int L = 0;
		int R = piece.length()-1;
		while(L<R){
			if(piece.charAt(L)!=piece.charAt(R)) {
				return false;
			}	
			L++;R--;
		}
		return true;
	}
}
