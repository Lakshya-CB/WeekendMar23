package Lec_BTree;

public class Client_BT {
	public static void main(String[] args) {
//		int[] pre = { 10, 20, 40, 50, 30, 60 };
//		int[] in = { 40, 20, 50, 10, 30, 60 };
//		BTree BT = new BTree(pre, in);
//		BT.print();
//		BT.level2();
		int[] lvl = {10,20,30,40,50,-1,70,-1,-1,100,110,-1,120};
		BTree BT = new BTree(lvl);
		BT.level2();
//		BT.print();
	}
}
