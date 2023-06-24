package Lec_28;

import java.util.ArrayList;

public class partitioning2 {
	public static void main(String[] args) {
		kaat("abc", "",new ArrayList<>());
	}

	public static void kaat(String table, String bag, 
			ArrayList<String> AL_bag) {
		if(table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("===============");
			
		}
//		table =  "abcd"'
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			String remain = table.substring(chakku);
//			System.out.println(piece + " - " + table);
//			AL_bag.add(piece);
			//////////////////////////////
			ArrayList<String> AL_nn  = new ArrayList<>(AL_bag);
			AL_nn.add(piece);
			kaat(remain, bag + "-"+piece,AL_nn);
		}
	}
}
