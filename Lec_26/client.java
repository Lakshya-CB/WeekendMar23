package Lec_26;

public class client {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student("babu",2);
		s1.Intro();
		
		s1.setAge(10);
		s1.setAge(-100);
		
		s1.Intro();
		
	}
}
