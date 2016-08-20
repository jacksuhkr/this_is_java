package sec10.exam02_static_method;
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();		//같은 클래스안에 있어도, 스태틱 메소드에서 인스턴스 멤버를 사용하려면
		myCar.speed = 60;						//이렇게 객체생성을 해서 사용해야함
		myCar.run();
	}
}
