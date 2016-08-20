package sec02.exam02_array_index_out_of_bounds;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];		// args에 값이 들어가 있지 않으므로 오류가남
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[0]: " + data1);
	}
}
