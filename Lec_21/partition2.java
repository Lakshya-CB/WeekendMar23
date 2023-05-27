package Lec_21;

import java.util.ArrayList;
import java.util.List;

public class partition2 {
	public static void main(String[] args) {
		List<String> AL = new ArrayList<>();
		kaat("abc", "",AL);
//		System.out.println(AL);
	}

	public static void kaat(String table, String bag,List<String> AL_bag) {
		if (table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("=--=-=-=-=--==-=-=");
			return;
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			String remain = table.substring(chakku);
			AL_bag.add(piece);
//			List<String> new_AL = new ArrayList<>(AL_bag);
//			new_AL.add(piece);
			kaat(remain, bag + piece + "=",AL_bag);
			AL_bag.remove(AL_bag.size()-1);
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
