package sec04_exercise;

public class Exercise03 {
	public static void main(String[] args) {
		//작성위치
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0){
				sum += i;
			}
		}
		
		System.out.println("3의 배수의 합: " + sum);
	}
}
