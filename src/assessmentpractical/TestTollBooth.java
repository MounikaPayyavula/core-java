package assessmentpractical;

public class TestTollBooth {

	public static void main(String[] args) {
		int count=0;
		
		Tollbooth booth=new AlleghenyTollBooth();
		
		Truck ford= new FordTruck(5, 12500);
	
		Truck nissan=new NissanTruck(2, 5000);
		
		Truck daewoo=new DaewooTruck(6, 17000);
		
		booth.calculateToll(ford);
		count++;
		booth.calculateToll(nissan);
		count++;
		
		booth.calculateToll(daewoo);
		count++;
		booth.displayData();
	
		

	}

}
