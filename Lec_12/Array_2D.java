package Lec_12;

public class Array_2D {
	public static void main(String[] args) {
		int[][] mat = new int[3][4];
		System.out.println(mat);
		System.out.println(mat.length);
		System.out.println(mat[0]);
		System.out.println(mat[1]);
		System.out.println(mat[2]);
//		System.out.println(mat[3]);
		for(int[] row : mat) {
//			System.out.println(row);
			for(int ali : row) {
				System.out.print(ali+" ");
			}
			System.out.println();
		}
		System.out.println("==========");
		mat[0][0]  =1;
		mat[0][1]  =2;
		mat[0][2]  =3;
		mat[0][3]  =4;
		for(int[] row : mat) {
//			System.out.println(row);
			for(int ali : row) {
				System.out.print(ali+" ");
			}
			System.out.println();
		}
		System.out.println("==========");		
		
		
	}
}
