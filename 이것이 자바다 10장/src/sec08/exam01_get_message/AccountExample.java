package sec08.exam01_get_message;

import sec07.exam01_customised_exception.BalanceInsufficientException;
import sec07.exam02_throw_new.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalance());
		//����ϱ�
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) { 
			String message = e.getMessage();	//account withdraw�� throw new�� �޾Ƽ� message�� ����
			System.out.println(message);		//������ ���� message�� ���
			System.out.println();
			e.printStackTrace();				//������ ����(�����ڵ�)�� �����
		}
	}
}
