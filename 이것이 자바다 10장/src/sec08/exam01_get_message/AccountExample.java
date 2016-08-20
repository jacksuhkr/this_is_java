package sec08.exam01_get_message;

import sec07.exam01_customised_exception.BalanceInsufficientException;
import sec07.exam02_throw_new.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		//출금하기
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) { 
			String message = e.getMessage();	//account withdraw의 throw new를 받아서 message에 저장
			System.out.println(message);		//위에서 받은 message를 출력
			System.out.println();
			e.printStackTrace();				//에러의 내용(오류코드)을 출력함
		}
	}
}
