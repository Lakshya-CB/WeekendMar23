package Lec_LL;

import java.util.*;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public boolean isEmpty() {
		return head == null;
	}

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");

			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		Node temp = head;
		int ans = 0;
		while (temp != null) {
			temp = temp.next;
			ans++;
		}
		return ans;
	}

	public int getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein?");
		}
		return head.data;
	}

	public int getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kya deekh rha hein?");

		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kya deekh rha hein?");

		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(int ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node nn = new Node(ali);
		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		lastNode.next = nn;
	}

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, int ali) {
		if (idx == 0) {
			addFirst(ali);
		} else if (idx == size() - 1) {
			addLast(ali);
		} else {
			Node curr = new Node(ali);
			Node prev = getNodeAt(idx - 1);
			Node after = prev.next;

			prev.next = curr;
			curr.next = after;

		}
	}

	public int removeLast() {
		if (size() <= 1) {
			return removeFirst();
		}
		Node secondLast = getNodeAt(size() - 2);
		Node last = secondLast.next;
		secondLast.next = null;
		return last.data;
	}

	public int removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya nikaal rha hein ??");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}

	public int removeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kya nikaal rha hein ??");

		} else if (idx == 0) {
			return removeFirst();
		} else if (idx == size() - 1) {
			return removeLast();
		}
		Node prev = getNodeAt(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;
		prev.next = after;
		return curr.data;
	}

	public void reversePrint() {
		reversePrint(head);
	}

	private void reversePrint(Node nn) {
		if (nn == null) {
			return;
		}
		reversePrint(nn.next);
		System.out.println(nn.data);
	}

	public void reverse() {
		reverse(head);
	}

	private Node reverse(Node nn) {
		if (nn.next == null) {
			head = nn;
			return nn;
		}
		Node tail = reverse(nn.next);
		tail.next = nn;
		nn.next = null;
		return nn;
	}

	public void reverse2() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;
			curr.next = prev;

			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void reverseK(int K) {
		Node curr = head;
		Node nhead = null;
		Node ntail = null;
		Stack<Node> S = new Stack<>();
		while (curr != null) {
			Node after = curr.next;
			S.add(curr);
			if (S.size() == K) {
				while (!S.isEmpty()) {
					Node temp = S.pop();
					if (nhead == null) {
						nhead = temp;
						ntail = temp;
						ntail.next = null;
					} else {
						ntail.next = temp;
						ntail = temp;
						ntail.next = null;
					}
				}
			}
			curr = after;
		}
		head = nhead;
	}

	public int getMid() {
		Node fast = head;
		Node slow = head;
//		while (fast.next!= null || fast!=null) {
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	public int lastKth(int k) {
		Node ahead = head;
		for(int i=0;i<k;i++) {
			ahead = ahead.next;
		}
		Node curr = head;
		
	}
}
