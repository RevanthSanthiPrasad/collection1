package collection_1;

public class Student {
	private String name;
	private String gender;
	private int fees;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender () {
		return gender;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getFees() {
		return fees;
	}
	public Student(String name, String gender, int fees) {
		this.name = name ;
		this.gender = gender;
		this.fees = fees;
	}
	public String toString() {
		return name+" "+gender+" "+fees;
	}
}
