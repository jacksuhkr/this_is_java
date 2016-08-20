package sec08.exercise;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		Boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		int ScoreWritten = 0;  // 추가함
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				//작성 위치
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo ==2) {
				//작성 위치	
				if (studentNum<=0) System.out.println("학생수를 바르게 입력해주세요!");
				else {
					ScoreWritten=1;
//					System.out.println("각 학생의 점수를 입력해주세요!");
					for(int i=0; i<scores.length; i++) {
						System.out.print("scores[" + i + "]> ");
						scores[i] = scanner.nextInt();
					}
				}
			} else if(selectNo ==3) {
				//작성 위치	
				if (studentNum<=0) System.out.println("학생수를 입력해주세요!");
				else if (ScoreWritten==0) System.out.println("점수를 입력해주세요!");
				else {
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores[" + i + "]: " + scores[i]);
					}
				}
			} else if(selectNo ==4) {
				//작성 위치
				if (studentNum<=0) System.out.println("학생수를 입력해주세요!");
				else if (ScoreWritten==0) System.out.println("점수를 입력해주세요!");
				else {
					int sum = 0;
					int max = 0;
					for(int i=0; i<scores.length; i++) {
						sum += scores[i];
						if(scores[i]>max) max = scores[i];
					}
					double avg = (double) sum / studentNum;
					System.out.println("최고점수: " + max);
					System.out.println("평균점수: " + avg);
				}
			} else if(selectNo ==5) {
				run = false;	
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
