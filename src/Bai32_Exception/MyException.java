package Bai32_Exception;

public class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}

	public MyException(String message, Throwable a) {
		super(message, a);
	}
}
