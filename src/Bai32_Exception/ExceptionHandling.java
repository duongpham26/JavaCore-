package Bai32_Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			checkAge(-1);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
		}
	}

	public static void checkAge(int age) throws MyException {
		if (age < 0) {
			throw new MyException("run error");
		}
	}

}
