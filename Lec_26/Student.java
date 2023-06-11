package Lec_26;

public class Student {
	// data members!!
//	data parsing!!!!
	private String Name = "gun claha";
	private int Age = 0;

	public void Intro() {
		System.out.println(this);
		System.out.println(Name + " - " + Age);
		System.out.println("================");
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) throws Exception {
		if(Age <0) {
			//throw new RuntimeException("kya bee ? Age -ve mat kar");// unchecked
			throw new Exception("bhai merer ? kyaa?"); 
		}
		this.Age = Age;

	}

	public void partyWith(String Name) {
		System.out.println(this.Name + " partyyyy with " + Name);
	}

	public Student(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;

	}

}
