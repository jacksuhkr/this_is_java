package sec03.exam03_access_local_class;

public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; 			//(x)
		//localVariale = 100;	//(x)
		class Innter {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;				//(x) 값을 못 바꿈
		//localVariable = 100;		//(x) 값을 못 바꿈
		
		//로컬 클래스 선언
		class Innter{
			public void method() {
				int result = arg + localVariable;
			}
		}
		//final을 언급하지 않아도, 알아서 모든 변수를 final처리
	}
}
