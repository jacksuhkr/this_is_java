package sec07.exam02_throw_new;

import sec07.exam01_customised_exception.BalanceInsufficientException;

public class Account {
	private long balance;
	
	public Account() { }
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����: " + (money-balance) + "���ڶ�");
		}
		balance -= money;		//�ܰ� �������� �������
	}
}
