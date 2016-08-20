package sec04.exam03_over_flow;

public class OverflowExample {
	public static void main(String[] args){
		// int의 범위를 넘어서 garbage값이 나옴
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		// long으로 바꾸면 해결
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;
		System.out.println(z2);
	}

}
