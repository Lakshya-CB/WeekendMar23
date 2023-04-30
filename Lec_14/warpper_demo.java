package Lec_14;

public class warpper_demo {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		Integer I = 100;
		System.out.println(I+89-12);
		
//		I= i; // autoboxing!!
//		System.out.println(I);
		
		i = I;// unboxing!!
		System.out.println(I);
		
	}
}
