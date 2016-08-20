package sec07.exam01_customised_exception;

public class BalanceInsufficientException extends Exception {
	//매개변수 없는 생성자
	public BalanceInsufficientException() {}
	//매개변수 있는 생성자
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
