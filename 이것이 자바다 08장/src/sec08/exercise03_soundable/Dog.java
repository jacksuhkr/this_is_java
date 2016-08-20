package sec08.exercise03_soundable;

public class Dog implements Soundable {
	@Override
	public String sound() {		//public을 잊지 말아야함! 사실 interface에는 public이 있지만 생략된것
		return "멍멍";
	}
}
