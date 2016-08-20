package sec03.exam01_implements;

import sec01.exam01_interface_declaration.RemoteControl;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() { /* TODO Auto-generated method stub */}
			@Override
			public void turnOff() {	/* TODO Auto-generated method stub */ }
			@Override
			public void setVolume(int volume) {	/* TODO Auto-generated method stub	*/}
		};
	}
	
}
