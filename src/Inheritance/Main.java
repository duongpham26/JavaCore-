package Inheritance;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Pham Thanh Duong", 22, "HCM");
		person.toString();

		Student student = new Student();
		Student.z = 6;
		System.out.println("final " + Person.z);

	}
}
