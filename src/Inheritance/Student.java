package Inheritance;

public class Student extends Person {
	private float DTB;
	private String lopHoc;

	public Student() {
		super();
	}

	public Student(String name, int age, String address, float DTB, String lopHoc) {
		super(name, age, address);
		this.DTB = DTB;
		this.lopHoc = lopHoc;
	}

	public float getDTB() {
		return DTB;
	}

	public void setDTB(float dTB) {
		DTB = dTB;
	}

	public String getLopHoc() {
		return lopHoc;
	}

	public void setLopHoc(String lopHoc) {
		this.lopHoc = lopHoc;
	}

	@Override
	public String toString() {
		return "Student [DTB=" + DTB + ", lopHoc=" + lopHoc + ", name=" + name + ", age=" + age + ", address=" + address
				+ "]";
	}

}
