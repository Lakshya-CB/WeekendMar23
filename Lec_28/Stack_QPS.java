package Lec_28;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 20, 45, 30, 5, 60, 18, 2 };
		nextGr8er2(arr);
	}

	public static void nextGr8er(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + " => " + B);
			}
			S.add(B);
		}
		while(!S.isEmpty()) {
			int A = S.pop();
			System.out.println(A + " => " + -1);
			
		}
	}
	public static void nextGr8er2(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> S = new Stack<>();
		for (int idx =0;idx<arr.length;idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
//				System.out.println(A + " => " + B);
			}
			S.add(idx);
		}
		while(!S.isEmpty()) {
			int A_idx = S.pop();
			ans[A_idx] = -1;
//			System.out.println(A + " => " + -1);
			
		}
		System.out.println(Arrays.toString(ans));
	}
}
