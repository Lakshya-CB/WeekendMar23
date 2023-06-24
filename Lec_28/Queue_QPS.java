package Lec_28;
import java.util.*;
public class Queue_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
		
		System.out.println(Q);
//		Print(Q);
		RevPrint(Q,0);
		System.out.println(Q);

	}
	public static void Print(Queue<Integer> Q) {
		for(int count = 1;count<=Q.size();count++) {
				int ali = Q.poll();
				System.out.println(ali);
				Q.add(ali);
//				System.out.println(Q);
		}
	}
	public static void Reverse(Queue<Integer>Q) {
		if(Q.isEmpty()) {
			return;
		}
		int ali = Q.poll();
		Reverse(Q);
		Q.add(ali);
	}
	public static void RevPrint(Queue<Integer>Q, int count) {
		if(count==Q.size()) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		RevPrint(Q, count+1);
		System.out.println(ali);
		
	}
}
