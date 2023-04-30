package Lec_14;

import java.util.ArrayList;

public class AL_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<>(5);
		System.out.println(AL);
		AL.add(10);
		System.out.println(AL);
		AL.add(20);
		System.out.println(AL);
		AL.add(30);
		System.out.println(AL);
		AL.add(40);
		System.out.println(AL);
		AL.add(50);
		System.out.println(AL);
		
		System.out.println(AL.size());
//		ith index ki bhavue?
		System.out.println(AL.get(2));
//		upddat?!
		AL.set(2, 99);
		System.out.println(AL);
		AL.add(1, -87);
		System.out.println(AL);
//		delete
		int ali = AL.remove(1);
		System.out.println(ali + " => "+AL);
	}
}
