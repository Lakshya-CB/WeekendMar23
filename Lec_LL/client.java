package Lec_LL;

public class client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.disp();
		System.out.println(LL.getAt(2));
	}
}
