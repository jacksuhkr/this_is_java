package sec04_exercise;

public class Exercise03 {
	public static void main(String[] args) {
		//�ۼ���ġ
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0){
				sum += i;
			}
		}
		
		System.out.println("3�� ����� ��: " + sum);
	}
}
