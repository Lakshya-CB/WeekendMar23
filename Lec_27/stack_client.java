package Lec_27;

public class stack_client {
	public static void main(String[] args) {
		Stack S = new Stack();
		S.add(10); 
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);

		S.print();
		
		S.add(60);
	}
}
