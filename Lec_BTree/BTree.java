package Lec_BTree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;

	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + "=>" + nn.data + "<==";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
		print(nn.left);
		print(nn.right);
	}

	public BTree(int[] pre, int[] in) {
		root = createTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createTree(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (is > ie || ps > pe) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int f = -1;
		int Left_size = 0;
		for (int idx = is; idx <= ie; idx++) {
			if (in[idx] == pre[ps]) {
				f = idx;
				break;
			}
			Left_size++;
		}
		nn.left = createTree(pre, ps + 1, ps + Left_size, in, is, f - 1);
		nn.right = createTree(pre, ps + Left_size + 1, pe, in, f + 1, ie);
		return nn;
	}

	public int size() {
		return size(root);

	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = size(nn.left);
		int R = size(nn.right);

		return L + R + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	class pairHtDia {
		int Ht = -1;
		int Dia = 0;
	}

	private int Ht(Node nn) {
		if (nn == null) {

		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
//		int self= L+R+2;
		return Math.max(L, R) + 1;
	}

	public int Dia() {
		return Dia2(root).Dia;
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;
		return Math.max(Math.max(L, R), self);
	}

	private pairHtDia Dia2(Node nn) {
		if (nn == null) {
			return new pairHtDia();
		}
		pairHtDia L = Dia2(nn.left);
		pairHtDia R = Dia2(nn.right);
//		
		pairHtDia ans = new pairHtDia();
//		Ht!!!
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
//		Dia!!
		int self = L.Ht + R.Ht + 2;
		ans.Dia = Math.max(self, Math.max(L.Dia, R.Dia));
		return ans;
	}

	public boolean isBal() {
		return isBal(root);
	}

	class pairIsBal {
		boolean isBal = true;
		int ht = -1;
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return false;
		}
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);
		boolean self = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;
		return L && R && self;
	}

	private pairIsBal isBal2(Node nn) {
		if (nn == null) {
			return new pairIsBal();
		}
		pairIsBal L = isBal2(nn.left);
		pairIsBal R = isBal2(nn.right);
		pairIsBal ans = new pairIsBal();

		ans.ht = Math.max(L.ht, R.ht) + 1;

		boolean self = Math.abs(L.ht - R.ht) <= 1;
		ans.isBal = L.isBal && R.isBal && self;
		return ans;
	}

	public void lvlPrint() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			System.out.println(nn.data);
			if (nn.left != null) {
				Q.add(nn.left);
			}
			if (nn.right != null) {
				Q.add(nn.right);
			}
		}
	}

	class pairLvl {
		public pairLvl(Node root, int i) {
			// TODO Auto-generated constructor stub
			nn = root;
			lvl = i;
		}

		Node nn;
		int lvl;
	}

	public void level2() {
		Queue<pairLvl> Q = new LinkedList<>();
		Q.add(new pairLvl(root, 0));
		int prev = 0;
		while (!Q.isEmpty()) {
			pairLvl curr = Q.poll();
			if (prev != curr.lvl) {
				System.out.println();
			}
			System.out.print(curr.nn.data + " ");

			prev = curr.lvl;
			if (curr.nn.left != null) {
				Q.add(new pairLvl(curr.nn.left, curr.lvl + 1));
			}
			if (curr.nn.right != null) {
				Q.add(new pairLvl(curr.nn.right, curr.lvl + 1));
			}
		}

	}

	public BTree(int[] lvl) {
		Queue<Node> Q = new LinkedList<>();
		Q.add(new Node(lvl[0]));
		root = Q.peek();
		int idx = 1;
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}
	}
}
