package sec02.exam03_number_format_exception;

public class ArrayIndexOutOfBoundsExceptionExample2 {
	public static void main(String[] args) {
			String data1 = "100";
			String data2 = "a100";
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);	//NumberFormatException �߻�
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
