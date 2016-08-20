package sec04.exam01_use_interface;

import sec01.exam01_interface_declaration.RemoteControl;
import sec03.exam01_implements.*;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
