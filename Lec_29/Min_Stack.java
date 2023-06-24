package Lec_29;

public class Min_Stack extends Dynamic_Stack {
	int curr_min = 0;

	@Override
	public int peek() {
		int ali = super.peek();
		if (ali < curr_min) {
			return curr_min;
		} else {
			return ali;
		}
	}

	public int getMin() {
		return curr_min;
	}

	@Override
	public void add(int ali) {
		if (isEmpty()) {
			curr_min = ali;
		}
		if (ali >= curr_min) {
			super.add(ali);
		} else {
			int prev_min = curr_min;
			curr_min = ali;
			int M = 2 * curr_min - prev_min;
			super.add(M);
		}
	}

	@Override
	public int pop() {
		int ali = super.pop();
		if (ali >= curr_min) {
			return ali;
		} else {
//			ali // = >Magical
			int M  = ali;  //=> curr min
			int ans = curr_min;
			int prev_min = 2*curr_min - M;
			curr_min = prev_min;
			
			
			return ans;
			
		}
	}

}
