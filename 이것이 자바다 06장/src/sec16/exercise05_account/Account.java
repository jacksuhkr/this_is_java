package sec16.exercise05_account;

public class Account {
	//작성 위치
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	//Getter
	public int getBalance() {
		return balance;
	}
	
	//Setter
	public void setBalance(int balance) {
		if( balance < MIN_BALANCE || balance > MAX_BALANCE ) {
			return;
		} else {
			this.balance = balance;
		}
	}
}
