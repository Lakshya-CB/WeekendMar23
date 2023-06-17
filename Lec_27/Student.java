package Lec_27;

public class Student {

	private int Age;
	private String Name;

	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
		this.Age = i;
		this.Name = string;
	}

	public int getAge() {
		return Age;
	}

	public void setAget(int Age) {
		if (Age < 0) {
			throw new RuntimeException("bhai nahu");
		}
		this.Age = Age;
	}
}
