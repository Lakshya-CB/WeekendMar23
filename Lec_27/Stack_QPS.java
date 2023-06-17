package Lec_27;

import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
//		System.out.println(S);
//		System.out.println(S.pop());
//		System.out.println(S);
		print(S);
	}

	public static void print(Stack<Integer> S) {
		Stack<Integer> Ex = new Stack<>();
		while (!S.isEmpty()) {
			int ali = S.pop();
			System.out.println(ali);
			Ex.add(ali);
		}
		while (!Ex.isEmpty()) {
			int ali = Ex.pop();

			S.add(ali);
		}
	}

	public static void RevRec(Stack<Integer> S) {
		if(S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		RevRec(S);
		System.out.println(ali);
		S.add(ali);
	}

}