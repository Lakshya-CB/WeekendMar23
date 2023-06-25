package Lec_LL;

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
		return head==null;
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
		if(isEmpty()) {
			throw new RuntimeException("kya deekh rha hein?");
		}
		return head.data;
	}

	public int getLast() {
		if(isEmpty()) {
			throw new RuntimeException("kya deekh rha hein?");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		if(idx<0||idx>=size()) {
			throw new RuntimeException("kya deekh rha hein?");
		
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	private Node getNodeAt(int idx) {
		if(idx<0||idx>=size()) {
			throw new RuntimeException("kya deekh rha hein?");
		
		}
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(int ali) {
		if(isEmpty()) {
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
		if(idx==0) {
			addFirst(ali);
		}else if(idx==size()-1) {
			addLast(ali);
		}else {
			Node curr = new Node(ali);
			Node prev = getNodeAt(idx-1);
			Node after = prev.next;
			prev.next = curr;
			curr.next = after;
			
		}
	}
}
