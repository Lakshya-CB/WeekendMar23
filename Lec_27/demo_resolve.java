package Lec_27;

public class demo_resolve {
	public static void main(String[] args) {
		Student s1 = new Student("A", 10);

		try {
			System.out.println("Try start");
			s1.setAget(10);
			s1.setAget(10);
			s1.setAget(1000);
			System.out.println("Try End");
		} catch (Exception e) {
			System.out.println("Exce mili!!");
//			System.err.println(e.getMessage());
//			e.printStackTrace();
		}finally {
			System.out.println("finall y chal gya");
		}
		System.out.println("last mein chal gya");
		System.out.println(s1.getAge());
	}
}
