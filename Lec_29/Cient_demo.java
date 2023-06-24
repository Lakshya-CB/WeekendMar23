package Lec_29;

public class Cient_demo {
	public static void main(String[] args) {
//C1//		Parent P = new Parent();

//C2		Child C = new Child();

//C3		Parent P = new Child();
//		List<> AL = new ArrayList<>();
//C4		Child C = new Parent();
		System.out.println("===========");
		Child C = new Child();
		System.out.println(C.dataC);
		System.out.println(C.dataP);
		System.out.println("======");
		System.out.println(C.data); //LHS
		System.out.println(((Parent)C).data);
		System.out.println("=======");
//		Parent P = new Child();
//		System.out.println(P.data);
//		System.out.println(((Child)P).data);
		System.out.println("=======");
		C.funP();
		C.funC();
		System.out.println("=========");
		C.fun(); 
		((Parent)C).fun(); 
		
		
	}
	
	
}
