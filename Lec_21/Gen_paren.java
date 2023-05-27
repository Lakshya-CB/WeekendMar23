package Lec_21;

public class Gen_paren {
	public static void main(String[] args) {
		solve(3, 3, "");
	}

	public static void solve(int op, int cl, String path) {
		if (op < 0 || cl < 0||op>cl) { //-ve BC
			return;
		}
		if (op == 0 && cl == 0) {
			System.out.println(path);
			return;
		}

		solve(op - 1, cl, path + "(");

		solve(op, cl - 1, path + ")");

	}
}
