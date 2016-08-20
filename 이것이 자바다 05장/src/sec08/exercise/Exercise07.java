package sec08.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		//작성 위치
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) max=array[i];
		}
		//작성 위치
		
		System.out.println("max: " + max);
	}
}
