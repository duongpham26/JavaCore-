package Inheritance;

public class Employee extends Person {

	private String congViet;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, String address, String congViet) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
		this.congViet = congViet;
	}

	public String getCongViet() {
		return congViet;
	}

	public void setCongViet(String congViet) {
		this.congViet = congViet;
	}

	@Override
	public String toString() {
		return "Employee [congViet=" + congViet + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
