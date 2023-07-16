package Lec_BTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
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

	public BST(int[] lvl) {
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

	public boolean Find(int ali) {
		return Find(root, ali);
	}

	private boolean Find(Node nn, int ali) {
		if (nn == null) {
			return false;
		}
		if (nn.data == ali) {
			return true;
		}
		if (nn.data < ali) {
			return Find(nn.right, ali);
		} else {
			return Find(nn.left, ali);
		}
	}

	public int Max() {
		return Max(root);
	}

	private int Max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		if (nn.right == null) {
			return nn.data;
		}
		return Max(nn.right);
	}

	public int Min() {
		return Min(root);
	}

	private int Min(Node nn) {
		if(nn==null) {
			return Integer.MAX_VALUE;
		}
		if (nn.left == null) {
			return nn.data;
		}
		return Min(nn.left);

	}

	public boolean isBST() {
		return isBST(root);
	}

	private boolean isBST(Node nn) {
		if(nn==null) {
			return true;
		}
		boolean L = isBST(nn.left);
		boolean R = isBST(nn.right);
		boolean self = Max(nn.left) < nn.data && nn.data < Min(nn.right);
		return L && R && self;
	}
}
