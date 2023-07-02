package Lec_LL;

public class client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		for(int ali = 10;ali<=90;ali=ali+10) {
			LL.addLast(ali);
		}
		LL.disp();
//		System.out.println(LL.getAt(2));
//		LL.reversePrint();
//		LL.reverse();
//		LL.disp();
		LL.reverseK(3);
		LL.disp();
		
	}
}
