package sec04_exercise;
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		
		int balance = 0;
		
		int in = 0;		//���� �߰���
		int out = 0;	//���� �߰���
		int sum = 0;	//���� �߰���
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����>");
			
			//�ۼ� ��ġ
			balance = scanner.nextInt();
			
			switch(balance) {
				case 1:
					System.out.print("���ݾ�>");
					in = scanner.nextInt();
					sum += in;
					break;
				case 2:
					System.out.print("��ݾ�>");
					out = scanner.nextInt();
					sum -= out;
					break;
				case 3:
					System.out.print("�ܰ�>");
					System.out.println(sum);
					break;
				case 4:
					run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}
}
