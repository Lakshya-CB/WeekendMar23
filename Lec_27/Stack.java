package Lec_27;

public class Stack {
	private int[] arr;
	private int top = -1;

	public Stack() {
		this(5);
	}

	public Stack(int cap) {
		arr = new int[cap];
	}

	public int size() {
		return top + 1;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public boolean isFull() {
		return arr.length==size();
	}
	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("kya daaal rha hein ?");
		}
		top++;
		arr[top] = ali;
	}
	public void push(int ali) {
		
		add(ali);
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("kya nikaal rha hein ?");
		}
		int ans = arr[top];
		top--;
		return ans;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("kya dheek rha hein ?");
		}
		return arr[top];
	}
	public void print() {
		for(int idx =0;idx<= top;idx++) {
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
