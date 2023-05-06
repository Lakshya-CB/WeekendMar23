package Lec_15;

import java.util.ArrayList;

public class SB_demo {
	public static void main(String[] args) {
		String str = "hello";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb+"--");
		System.out.println(sb.indexOf("lo"));
		System.out.println(sb.substring(0,4));
		
		System.out.println(sb.charAt(0));
		sb.setCharAt(3, '^');
		System.out.println(sb);
		
//		sb.append("????????????");
		sb.insert(1, "!");
		
		System.out.println(sb);
		
		String ans = sb.toString();
		
	}
}
