package oopsdemo1;

public class Lamp {
	// stores the value for light 
	// true if light is on
	// false if light is off 
	boolean isOn;
	//method to turn On the light 
	void turnOn()
	{ 
		isOn=true;
		System.out.println("Light On? "+isOn);
		}
	//method to turn Off the light 
	void turnOff()
	{ 
		isOn=false; 
		System.out.println("Light On? "+isOn);
		}

}

