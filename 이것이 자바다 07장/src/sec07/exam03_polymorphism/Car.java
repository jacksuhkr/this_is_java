package sec07.exam03_polymorphism;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);		//자동차는 4개의 타이어를 가진다
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { stop(); return 1; };	//모든 타이어를 1회 회전시키기 위해
		if(frontRightTire.roll()==false) { stop(); return 2; };	//roll 메소드를 호출한다.
		if(backLeftTire.roll()==false) { stop(); return 3; };  	//false를 리턴하는 roll()이 있을 경우
		if(backRightTire.roll()==false) { stop(); return 4; };	//stop 메소드를 호출하고 해당 타이어번호 리턴.
		return 0; 
	}
	
	void stop() {
		System.out.println("[자동차를 멈춥니다.]");
	}
}
