package sec09.exercise07_customised_exception;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		//작성 위치
		super(message);
	}
}
