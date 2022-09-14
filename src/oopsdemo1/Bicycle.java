package oopsdemo1;

public class Bicycle {
	int gear;
	void applyBrake()
	{
		System.out.println("Applying brakes");
	}
	public void startCycling()
	{
		gear=gear+1;
		System.out.println("Cycling is gear on : "+gear);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
