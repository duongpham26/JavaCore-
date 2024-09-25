package Bai44_Lambda;

public class Cat implements Printable {
	private String name;
	private int age;

	public Cat() {
	};

	public String print(String name, int age) {
		System.out.println("Meo");
		return name;
	}

}
