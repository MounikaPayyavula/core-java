package assessmentpractical;

public class FordTruck  implements Truck{

	int numberOfAxles;
	int totalWeight;
	String name="Ford Truck";
	
	public FordTruck(int numberOfAxles, int totalWeight) {
		this.numberOfAxles = numberOfAxles;
		this.totalWeight = totalWeight;
		
	}
	@Override
	public int noOfAxles() {
		return numberOfAxles;
		
	}
	@Override
	public int totalWeight() {
		return totalWeight;
		
		
	}
	@Override
	public String getName() {
		
		return name;
	}
}
