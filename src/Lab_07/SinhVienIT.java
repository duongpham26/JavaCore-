package Lab_07;

public class SinhVienIT extends SinhVien {
	private String Language;

	public void info() {
		System.out.println("From child");
	}

	public void getInfor() {
		super.info();
		System.out.println("Get info");
	}
}
