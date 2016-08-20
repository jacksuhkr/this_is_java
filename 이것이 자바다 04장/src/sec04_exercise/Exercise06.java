package sec04_exercise;
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		
		int balance = 0;
		
		int in = 0;		//내가 추가함
		int out = 0;	//내가 추가함
		int sum = 0;	//내가 추가함
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			
			//작성 위치
			balance = scanner.nextInt();
			
			switch(balance) {
				case 1:
					System.out.print("예금액>");
					in = scanner.nextInt();
					sum += in;
					break;
				case 2:
					System.out.print("출금액>");
					out = scanner.nextInt();
					sum -= out;
					break;
				case 3:
					System.out.print("잔고>");
					System.out.println(sum);
					break;
				case 4:
					run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
