package sec04.exam03_over_flow;

public class CheckOverflowExample {
	public static void main(String[] args){
		try {
			int result = safeAdd(200000000, 2000000000);
			System.out.println(result);
		}	catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}

	public static int safeAdd(int left, int right) {
		if((right>0)){
			if(left>(Integer.MAX_VALUE-right)) {		// 비교연산자에서 숫자크기의 한계는 없음?
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left+right;		// 기본적으로 덧셈을 해주는 메소드
	}
}
