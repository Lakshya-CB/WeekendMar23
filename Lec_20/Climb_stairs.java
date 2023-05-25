package Lec_20;

public class Climb_stairs {
	public static void main(String[] args) {
		Climb(0,5, "");
	}

	public static void Climb(int curr, int dest, String path) {
		if (curr == dest) { // pos!!
			System.out.println(path);
			return;
		}
		if (curr > dest) { // Neg
			return;
		}
		// BP :
		Climb(curr + 1, dest, path + 1);
		Climb(curr + 2, dest, path + 2);
	}
}
