package sec16.exercise06_account_bankapp;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	static int i = 0; 			//�߰���, �� ������ ���¼�
	static int l = 0;			//�߰���, ���� ���� �����̿��� ���¿�
	static String ano;			//�߰���, ���¹�ȣ
	static String owner;		//�߰���, ������
	static int balance;			//�߰���, �ʱ��Աݾ�
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();		//���͹��ÿ�
			System.out.println();	//������ ���� ��ĭ��
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
				System.out.println("���α׷� ����");
			}
			System.out.println();	//������ ���� ��ĭ��
		}
	}
		
		//���»����ϱ�
		private static void createAccount() {
			//�ۼ� ��ġ
			System.out.println("-----------");
			System.out.println("    ���»���");
			System.out.println("-----------");
			
			//���� ���� �Է¹ޱ�
			System.out.print("���¹�ȣ: ");
			ano = scanner.nextLine();
			System.out.print("������: ");
			owner = scanner.nextLine();
			System.out.print("�ʱ��Աݾ�: ");
			balance = scanner.nextInt();
			accountArray[i] = new Account(ano, owner, balance);

			// ���
			System.out.println("���: ���°� �����Ǿ����ϴ�");
			i++;
		}
		
		//���¸�Ϻ���
		private static void accountList() {
			//�ۼ� ��ġ
			System.out.println("-----------");
			System.out.println("    ���¸��");
			System.out.println("-----------");
			for(int k=0; k<i; k++) {
				System.out.println(accountArray[k].getAno() + "\t" 
						+ accountArray[k].getOwner() + "\t" + accountArray[k].getBalance());
			}
		}
		
		//�����ϱ�
		private static void deposit() {
			//�ۼ� ��ġ
			System.out.println("-----------");
			System.out.println("      ����");
			System.out.println("-----------");
			
			// ���¹�ȣ Ȯ��
			findAccount();
			
			//�����ϱ�
			System.out.print("���ݾ�: ");
			accountArray[l].setBalance(accountArray[l].getBalance() + scanner.nextInt());
			
			// ���
			System.out.println("���: ������ �����Ǿ����ϴ�");
		}
		
		//����ϱ�
		private static void withdraw() {
			//�ۼ� ��ġ
			System.out.println("-----------");
			System.out.println("      ���");
			System.out.println("-----------");
			
			// ���¹�ȣ Ȯ��
			findAccount();
			
			//����ϱ�
			System.out.print("���: ");
			accountArray[l].setBalance(accountArray[l].getBalance() - scanner.nextInt());
			//���̳ʽ� ���� �������� �����
			
			// ���
			System.out.println("���: ����� �����Ǿ����ϴ�");
		}
		
		//Account �迭���� ano�� ������ Account ��ü ã��
		private static Account findAccount() {
			//�ۼ� ��ġ
			while(true) { 
				System.out.print("���¹�ȣ: ");
				ano = scanner.nextLine();
				for(l=0; l<i; l++) {
					if(ano.equals(accountArray[l].getAno())) {
						return accountArray[l];
					}
				} 
				if(l==i) System.out.println("�ش���°� �����ϴ�. ���¹�ȣ�� �ٽ� �Է����ֽʽÿ�!\n");
			}
		}
}