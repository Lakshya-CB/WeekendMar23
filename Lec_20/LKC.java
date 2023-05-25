package Lec_20;

import java.util.ArrayList;
import java.util.List;

public class LKC {
	public static void main(String[] args) {
		List<String> AL = new ArrayList<>();
		LetterKC("543", "",AL);
		System.out.println(AL);
	}	
	public static void LetterKC(String digits, String ans,List<String> AL ) {
		if(digits.isEmpty()) {
//			System.out.println(ans);
			AL.add(ans);
			return ;
		}
//		digits = "352";
		char ch = digits.charAt(0); //'3'
		String remain = digits.substring(1); // "52"
		String options = Options(ch); //def
		for(int idx =0;idx<options.length();idx++) {
			LetterKC(remain, ans+options.charAt(idx),AL);
		}
	}
	public static String Options(char ch) {
		String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return arr[ch-'2'];
	}
}
