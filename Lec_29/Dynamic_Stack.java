package Lec_29;

import Lec_27.Stack;

public class Dynamic_Stack extends Stack {

	@Override
	public void add(int ali) {
		if(isFull()) {
			int[] big = new int[this.arr.length*2];
			for(int idx =0;idx<arr.length;idx++) {
				big[idx] = arr[idx];
			}
			arr= big;
		}
		super.add(ali);
	}
}
