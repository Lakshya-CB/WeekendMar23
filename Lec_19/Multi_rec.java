package Lec_19;

public class Multi_rec {
	public static void main(String[] args) {
		CT(3,"");
	}

	public static void CT(int n, String path) {
		if(n==0) {
			System.out.println(path);
			return;
		}
//		BP : CT(n,"");
//		SP : CT(n-1,);
		CT(n-1, path+"H");
		CT(n-1, path+"T");	
	}
}
