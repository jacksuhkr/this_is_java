package sec07.exam01_customised_exception;

public class BalanceInsufficientException extends Exception {
	//�Ű����� ���� ������
	public BalanceInsufficientException() {}
	//�Ű����� �ִ� ������
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
