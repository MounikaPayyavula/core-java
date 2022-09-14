package oopsdemo1;

public class LampTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object led & halogen
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		led.turnOn();;
		halogen.turnOn();
		led.turnOff();
		halogen.turnOff();
				

	}

}
