package Lec_12;

public class QPS_array_2d {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 } };
		spiral(arr);
//		wavey(arr);

	}

	public static void wavey(int[][] mat) {
		for (int c = 0; c < mat[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < mat.length; r++) {
					System.out.println(mat[r][c]);
				}
			} else {
				for (int r = mat.length - 1; r >= 0; r--) {
					System.out.println(mat[r][c]);
				}
			}
		}
	}

	public static void spiral(int[][] mat) {
		int rs = 0;
		int re = mat.length - 1;
		int cs = 0;
		int ce = mat[0].length - 1;

		int cnt = 0;
		int max = mat.length * mat[0].length;
		while (rs <= re && cs <= ce) {
			for (int r = rs; r <= re && cnt < max; r++) {
				System.out.print(mat[r][cs] + " ");
				cnt++;
			}
			System.out.println();
			for (int c = cs + 1; c <= ce && cnt < max; c++) {
				System.out.print(mat[re][c] + " ");
				cnt++;
			}

			System.out.println();
			for (int r = re - 1; r >= rs && cnt < max; r--) {
				System.out.print(mat[r][ce] + " ");
				cnt++;
			}

			System.out.println();
			for (int c = ce - 1; c >= cs + 1 && cnt < max; c--) {
				System.out.print(mat[rs][c] + " ");
				cnt++;
			}
			System.out.println();
			rs++;
			cs++;
			re--;
			ce--;
		}
	}
}
