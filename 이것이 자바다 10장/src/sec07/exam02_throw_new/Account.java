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
			throw new BalanceInsufficientException("잔고부족: " + (money-balance) + "모자람");
		}
		balance -= money;		//잔고가 부족하지 않을경우
	}
}
