package sec04_exercise;

public class Exercise04 {
	public static void main(String[] args) {
		//�ۼ���ġ
		int a = 0;
		int b = 0;
		
		while ((a+b)!=5) {
			a = (int)(Math.random()*6)+1;
			b = (int)(Math.random()*6)+1;
			System.out.println("(" + a + "," + b + ")");
		}
	}
}
