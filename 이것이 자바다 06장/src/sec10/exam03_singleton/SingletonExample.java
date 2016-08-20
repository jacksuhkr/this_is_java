package sec10.exam03_singleton;
public class SingletonExample {
	public static void main(String[] args) {
		/*
		 Singleton obj1 = new Singleton();	//컴파일 에러, 새로운 객체를 만들지 못함, 외부에서 호출 불가
		 Singleton obj2 = new Singleton();	//컴파일 에러
		 */
		
		Singleton obj1 = Singleton.getInstance();	//외부에서 호출할 수 있는 유일한 방법
		Singleton obj2 = Singleton.getInstance();	//하지만 같은 객체를 참고하게 된다
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
