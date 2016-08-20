package sec09.exercise07_customised_exception;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		//작성 위치
		super(message);
	}
}
