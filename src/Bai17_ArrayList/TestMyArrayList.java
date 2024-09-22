package Bai17_ArrayList;

public class TestMyArrayList {
	static class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Person person = (Person) obj;
			return this.name.equals(person.name) && this.age == person.age;
		}

		@Override
		public String toString() {
			return "Person {" + "name=" + this.name + ", age=" + this.age + "}";
		}
	}

	public static void main(String[] args) {
		MyArrayList<Person> myArrayListPerson1;

		MyArrayList<Person> myArrayListPerson2 = new MyArrayList<>(1);

		Person person1 = new Person("Duong 1", 18);
		Person person2 = new Person("Duong 2", 19);
		Person person3 = new Person("Duong 3", 18);
		Person person4 = new Person("Duong 4", 18);
		myArrayListPerson2.add(person1);
		myArrayListPerson2.add(person2);
		myArrayListPerson2.add(person3);
		myArrayListPerson2.add(1, person4);
//		myArrayListPerson2.remove(1);

		myArrayListPerson1 = myArrayListPerson2.clone();
		for (int i = 0; i < myArrayListPerson1.size(); i++) {
			System.out.println(myArrayListPerson1.get(i));
		}

		System.out.println("index : " + myArrayListPerson2.contains(new Person("Duong 4", 18)));
	}

}
