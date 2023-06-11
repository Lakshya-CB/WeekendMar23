package Lec_25_26;

public class Student {
	// data members!!
//	data parsing!!!!
	String Name = "gun claha";
	int Age = 0;

	public void Intro() {
		System.out.println(this);
		System.out.println(Name + " - " + Age);
		System.out.println("================");
	}
//	s1.partyWith(s2.Name);

	public void partyWith(String Name) {
		System.out.println(this.Name + " partyyyy with " + Name);
	}
	
	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	
	}
	public Student() {
		this("jjjjj",99);
	}
	
	public Student(String Name) {
		this(Name, 99);
		
	}
	public Student(int Age) {
		this("chomu", 101);
		
	}
}
