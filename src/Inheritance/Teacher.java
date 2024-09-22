package Inheritance;

public class Teacher extends Person {
	private String monHoc;
	private String trinhDo;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String address, String monHoc, String trinhDo) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
		this.monHoc = monHoc;
		this.trinhDo = trinhDo;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	@Override
	public String toString() {
		return "Teacher [monHoc=" + monHoc + ", trinhDo=" + trinhDo + ", name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}

}
